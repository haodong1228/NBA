package cn.qs.controller.player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.qs.bean.Player;
import cn.qs.bean.Team;
import cn.qs.bean.User;
import cn.qs.service.devolop.devolopPlan;
import cn.qs.service.player.Formatdata;
import cn.qs.service.player.PlayerService;
import cn.qs.service.team.TeamService;
import cn.qs.utils.DefaultValue;
import cn.qs.utils.JSONResultUtil;
import cn.qs.utils.MD5Util;
import cn.qs.utils.ValidateCheck;

@Controller /** 自动返回的是json格式数据 ***/
@RequestMapping("player")
public class PlayerContrller {

	private static final Logger logger = LoggerFactory.getLogger(PlayerContrller.class);

	@Autowired
	private PlayerService playerService;
	@Autowired
	private TeamService teamService;
	@Autowired
	private devolopPlan devolopService;

	/**
	 * 添加player
	 * 
	 * @param player
	 *            springMVC自动映射的实体
	 * @return
	 */
	@RequestMapping("addPlayer")
	@ResponseBody
	public JSONResultUtil addUser(Player player) {
		player.setPlayerId(MD5Util.createID());
		playerService.addPlayer(player);
		return JSONResultUtil.ok();
	}

	/**
	 * 分页查询user
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("getplayers")
	@ResponseBody
	public PageInfo<Player> getplayers(@RequestParam Map condition) {
		int pageNum = 1;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageNum"))) { // 如果不为空的话改变当前页号
			pageNum = Integer.parseInt(MapUtils.getString(condition, "pageNum"));
		}
		int pageSize = DefaultValue.PAGE_SIZE;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageSize"))) { // 如果不为空的话改变当前页大小
			pageSize = Integer.parseInt(MapUtils.getString(condition, "pageSize"));
		}
		// 开始分页
		PageHelper.startPage(pageNum, pageSize);
		List<Player> players = new ArrayList<Player>();
		System.out.println("获取球员信息："+(String)condition.get("tiaojian"));
		try {
			players = playerService.selectPlayerDetail(condition);
		} catch (Exception e) {
			logger.error("getUsers error！", e);
		}
		PageInfo<Player> pageInfo = new PageInfo<Player>(players);
		return pageInfo;
	}

	/**
	 * 删除user
	 * 
	 * @param user
	 *            springMVC自动映射的实体
	 * @return
	 */
	@RequestMapping("deletePlayer")
	@ResponseBody
	public JSONResultUtil deletePlayer(String playerId) {
		System.out.println("删除球员id:"+playerId);
		playerService.deletePlayer(playerId);
		return JSONResultUtil.ok();
	}

	/**
	 * 跳转打修改用户页面
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("updatePlayer")
	public String updatePlayer(String playerId, ModelMap map) {
		Map map1 = new HashMap();
		map1.put("playerId", playerId);
		List<Player> players = playerService.selectPlayerDetail(map1);
		List<Team> teams = teamService.findAllTeam();
		Player player = players.get(0);
		map.addAttribute("player", player);
		map.addAttribute("teams", teams);
//		System.out.println("修改用户id:"+userId);
		return "updatePlayer";
	}
	
	@RequestMapping("radar")
	public String getradar(ModelMap map) {
		System.out.println("球员六芒星");
		Map map1 = new HashMap();
		List<Player> players = playerService.selectPlayerDetail(map1);
		Map maxmap = playerService.selectMaxDataPlayer();
		map.addAttribute("players", players);
		map.addAttribute("maxdefen", maxmap.get("maxd"));
		map.addAttribute("maxfangshou", maxmap.get("maxf"));
		map.addAttribute("maxzuzhi", maxmap.get("maxz"));
		map.addAttribute("maxwaixian", "100");
		map.addAttribute("maxneixian", "100");
		map.addAttribute("maxzonghe", maxmap.get("maxj"));
		return "radar";
	}
	
	@RequestMapping("bar")
	public String getbar(ModelMap map) {
		System.out.println("球员比较");
		Map map1 = new HashMap();
		List<Player> players = playerService.selectPlayerDetail(map1);
		Map maxmap = playerService.selectMaxDataPlayer();
		map.addAttribute("players", players);
		map.addAttribute("maxdefen", maxmap.get("maxs"));
		map.addAttribute("maxfangshou", maxmap.get("maxf"));
		map.addAttribute("maxzuzhi", maxmap.get("maxz"));
		map.addAttribute("maxwaixian", "100");
		map.addAttribute("maxneixian", "100");
		map.addAttribute("maxzonghe", maxmap.get("maxj"));
		return "bar";
	}
	
	@RequestMapping("radarplay")
	@ResponseBody
	public List<Player> radarplay(@RequestParam Map condition) {
		
	
		List<Player> players = playerService.selectPlayerDetail(condition);
		
		return players;
	}
	
	
	
	@RequestMapping("getPlayerById")
	@ResponseBody
	public Map getPlayerById(@RequestParam Map condition) {
		String playerid = (String)condition.get("playerid");
		Player player = playerService.getPlayer(playerid);
		condition.put("name", player.getName());
		
		Double d = Formatdata.format(player.getScore());
		Double f = Formatdata.format(player.getBlockShot());
		Double z = Formatdata.format(player.getRemark1());
		Double w = Formatdata.format(player.getThreeHitRate());
		Double n = Formatdata.format(player.getPsHitRate());
		Double j = (d*0.2)+(f*0.2)+(z*0.2)+(w*0.2)+(n*0.2);
		
		
		
		condition.put("defen", d);
		condition.put("fangshou", f);
		condition.put("zuzhi", z);
		condition.put("waixian", w);
		condition.put("neixian", n);
		condition.put("zonghe", j);
		System.out.println("zonghe:"+j);
		
		return condition;
	}
	
	@RequestMapping("getPlayerByIds")
	@ResponseBody
	public List<Player> getPlayerByIds(@RequestParam Map condition) {
		List<Player> list = new ArrayList<Player>();
		String playerid1 = (String)condition.get("player1");
		String playerid2 = (String)condition.get("player2");
		if(playerid1==null||"".equals(playerid1)){
			playerid1="||||";
		}
		if(playerid2==null||"".equals(playerid2)){
			playerid2="||||";
		}
		Player player1 = playerService.getPlayer(playerid1);
		if(player1==null){
			player1 = new Player();
		}
		if(player1.getThreeHitRate()!=null){
			player1.setThreeHitRate(player1.getThreeHitRate().replace("%", ""));
		}if(player1.getPsHitRate()!=null){
			player1.setPsHitRate(player1.getPsHitRate().replace("%", ""));
		}
		player1.setRemark2(String.valueOf(formatPlayerData(player1)));
		
		Player player2 = playerService.getPlayer(playerid2);
		if(player2==null){
			player2 = new Player();
		}
		if(player2.getThreeHitRate()!=null){
			player2.setThreeHitRate(player2.getThreeHitRate().replace("%", ""));
		}if(player2.getPsHitRate()!=null){
			player2.setPsHitRate(player2.getPsHitRate().replace("%", ""));
		}
		player2.setRemark2(String.valueOf(formatPlayerData(player2)));
		
		if(player1==null){
			player1=new Player();
		}
		if(player2==null){
			player2=new Player();
		}
		System.out.println("player1:"+player1.getName());
		System.out.println("player2:"+player2.getName());
		list.add(player1);
		list.add(player2);
		return list;
	}

	/**
	 * 添加user
	 * 
	 * @param user
	 *            springMVC自动映射的实体
	 * @return
	 */
	@RequestMapping("doUpdatePlayer")
	@ResponseBody
	public JSONResultUtil doUpdateUser(Player player) {
		playerService.updatePlayer(player);
		return JSONResultUtil.ok();
	}
	
	/*
	 * 球员匹配度
	 */
	@RequestMapping("searchMarchingPlayer")
	@ResponseBody
	public List<Player> searchMarchingPlayer(@RequestParam Map condition) {
		List<Player> list = new ArrayList<Player>();
		list = playerService.searchMarchingPlayer(condition);
		return list;
	}
	
	public static Double formatPlayerData(Player player){
		Double score = 0.0;
		Double fs = 0.0;
		Double zz = 0.0;
		Double wx = 0.0;
		Double nx = 0.0;
		Double zh = 0.0;
		if(player.getScore()!=null){
			score = Double.valueOf(player.getScore());
		}
		if(player.getBlockShot()!=null){
			score = Double.valueOf(player.getBlockShot());
		}
		if(player.getRemark1()!=null){
			score = Double.valueOf(player.getRemark1());
		}
		if(player.getThreeHitRate()!=null){
			score = Double.valueOf(player.getThreeHitRate());
		}
		if(player.getPsHitRate()!=null){
			score = Double.valueOf(player.getPsHitRate());
		}
		return score*0.2+fs*0.2+zz*0.2+wx*0.2+nx*0.2;
	}
	
	/*
	 * 查询信息
	 */
	@RequestMapping("/findPlayerInfo")
	@ResponseBody
	public List<Player> findPlayerInfos(@RequestParam Map condition){
		List<Player> list = devolopService.findPlayerInfos(condition);
		return list;
	}
	
	/*
	 * 发展规划
	 */
	@RequestMapping("/buildDevolopPlan")
	@ResponseBody
	public Map buildDevolopPlan(@RequestParam Map condition){
		Map map = devolopService.buildDevolopPlan(condition);
		return map;
	}
	
	
}