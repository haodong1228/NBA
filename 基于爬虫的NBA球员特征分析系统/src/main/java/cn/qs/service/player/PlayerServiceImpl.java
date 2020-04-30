package cn.qs.service.player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.qs.bean.Player;
import cn.qs.bean.PlayerExample;
import cn.qs.bean.PlayerExample.Criteria;
import cn.qs.mapper.PlayerMapper;
import cn.qs.mapper.player.MyPlayerMapper;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	private PlayerMapper playerMapper;
	@Autowired
	private MyPlayerMapper PlayerMapper;
	
	@Override
	public List<Player> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player findUserByPlayerName(String playName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPlayer(Player player) {
		playerMapper.insertSelective(player);
		
	}

	@Override
	public List<Player> getPlayers(Map condition) {

		PlayerExample playerExample = new PlayerExample();
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "name"))) {
			Criteria createCriteria = playerExample.createCriteria();
			createCriteria.andNameLike("%" + MapUtils.getString(condition, "name") + "%");
		}
		List<Player> list = playerMapper.selectByExample(playerExample);
		return list;
	
	}

	@Override
	public void deletePlayer(String playerId) {
		playerMapper.deleteByPrimaryKey(playerId);
		
	}

	@Override
	public Player getPlayer(String playerId) {
		
		return playerMapper.selectByPrimaryKey(playerId);
	}

	@Override
	public void updatePlayer(Player player) {
		playerMapper.updateByPrimaryKeySelective(player);
		
	}

	@Override
	public List<Player> selectPlayerDetail(Map map) {
		//对条件数据进行处理
		String tiaojian = (String)map.get("tiaojian");
		if(tiaojian==null || "".equals(tiaojian)){
			tiaojian = "defen";
		}
		String orderBy = "";
		switch(tiaojian){
			case "defen":orderBy="score";
			break;
			case "toulan":orderBy="shoot";
			break;
			case "sanfen":orderBy="three";
			break;
			case "faqiu":orderBy="Penalty_shot";
			break;
			case "lanban":orderBy="backboard";
			break;
			case "shiwu":orderBy="error";
			break;
			case "gaimao":orderBy="block_shot";
			break;
			case "qiangduan":orderBy="steals";
			break;
		}
		map.put("column", orderBy);
		//System.out.println("orderBy:"+orderBy);
		return PlayerMapper.selectPlayersByMap(map);
	}

	@Override
	public Map<String, String> selectMaxDataPlayer() {
		Map map = PlayerMapper.selectMaxDataFromPlayer();
		if(map==null){
			map = new HashMap();
		}
		System.out.println(map.toString());
		Double maxd = Formatdata.format(String.valueOf((Double)map.get("maxs")));
		Double maxf = Formatdata.format(String.valueOf((Double)map.get("maxf")));
		Double maxz = Formatdata.format(String.valueOf((Double)map.get("maxz")));
		Double quan = 0.2;

		Double maxj = (maxd*quan)+(maxf*quan)+(maxz*quan)+20+20;
		map.put("maxd",maxd);
		map.put("maxf",maxf);
		map.put("maxz",maxz);
		map.put("maxj",maxj);
		System.out.println("maxzonghe"+maxj);
		
		return map;
	}
	

	@Override
	public List<Player> searchMarchingPlayer(Map map) {
		List<Player> list = new ArrayList<Player>();
		
		list = PlayerMapper.searchMarchingPlayer(map);
		
		return list;
	}
	

}
