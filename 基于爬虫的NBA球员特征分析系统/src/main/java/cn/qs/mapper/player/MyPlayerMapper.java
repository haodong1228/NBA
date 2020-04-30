package cn.qs.mapper.player;

import java.util.List;
import java.util.Map;

import cn.qs.bean.Player;

public interface MyPlayerMapper {
	List<Player> selectPlayersByMap(Map map);
	
	int insertByMap(Map map);
	
	List<Player> searchMarchingPlayer(Map map);
	Map<String,String> selectMaxDataFromPlayer();
	List<Player> findPlayerInfos(Map condition);
	
}
