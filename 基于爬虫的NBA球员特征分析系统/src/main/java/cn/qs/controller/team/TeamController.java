package cn.qs.controller.team;

import java.util.ArrayList;
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

import cn.qs.bean.Team;
import cn.qs.service.team.TeamService;
import cn.qs.utils.DefaultValue;
import cn.qs.utils.JSONResultUtil;
import cn.qs.utils.MD5Util;
import cn.qs.utils.ValidateCheck;

@Controller /** 自动返回的是json格式数据 ***/
@RequestMapping("team")
public class TeamController {

	private static final Logger logger = LoggerFactory.getLogger(TeamController.class);

	@Autowired
	private TeamService teamService;



	@RequestMapping("addTeam")
	@ResponseBody
	public JSONResultUtil addTeam(Team team) {
		Team findTeam = teamService.findTeamByTeamName(team.getTeamName());
		if (findTeam != null) {
			return JSONResultUtil.error("球队已存在");
		}
		team.setTeamId(MD5Util.createID());
		teamService.addTeam(team);
		return JSONResultUtil.ok();
	}

	/**
	 * 分页查询user
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("getTeams")
	@ResponseBody
	public PageInfo<Team> getTeams(@RequestParam Map condition) {
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
		List<Team> teams = new ArrayList<Team>();
		System.out.println("获取球员信息："+(String)condition.get("tiaojian"));
		try {
			teams = teamService.getTeams(condition);
		} catch (Exception e) {
			logger.error("getUsers error！", e);
		}
		PageInfo<Team> pageInfo = new PageInfo<Team>(teams);
		return pageInfo;
	}

	
	@RequestMapping("deleteTeam")
	@ResponseBody
	public JSONResultUtil deletePlayer(String teamId) {
		System.out.println("删除球员id:"+teamId);
		teamService.deleteTeam(teamId);
		return JSONResultUtil.ok();
	}

	/**
	 * 跳转打修改用户页面
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("updateTeam")
	public String updateUser(String teamId, ModelMap map) {
		Team team = teamService.getTeam(teamId);
		map.addAttribute("team", team);
		System.out.println("修改teamid:"+teamId);
		return "updateTeam";
	}


	@RequestMapping("doUpdateTeam")
	@ResponseBody
	public JSONResultUtil doUpdateUser(Team team) {
		teamService.updateTeam(team);
		return JSONResultUtil.ok();
	}
	
	@RequestMapping("addPlayer")
	public String getAllTeam(ModelMap map){
		List<Team> teams = new ArrayList<Team>();
		teams = teamService.findAllTeam();
		map.addAttribute("teams", teams);
		System.out.println("跳转增加球员信息页面，获取球队信息size:"+teams.size());
		return "playerinfo-add";
	}
	@RequestMapping("addCoach")
	public String getAllTeamCoach(ModelMap map){
		List<Team> teams = new ArrayList<Team>();
		teams = teamService.findAllTeam();
		map.addAttribute("teams", teams);
		System.out.println("跳转增加球员信息页面，获取球队信息size:"+teams.size());
		return "chiefcoachinfo-add";
	}
	
}