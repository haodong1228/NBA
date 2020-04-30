package cn.qs.service.player;

import java.util.List;
import java.util.Map;

import cn.qs.bean.Player;



public interface PlayerService {

	/**
	 * 根据接口查询
	 */
	public List<Player> findAllUser();
	
	public Player findUserByPlayerName(String playName);

	public void addPlayer(Player player);

	public List<Player> getPlayers(Map condition);

	public void deletePlayer(String playerId);

	public Player getPlayer(String playerId);

	public void updatePlayer(Player player);
	
	public List<Player> selectPlayerDetail(Map map);
	
	public List<Player> searchMarchingPlayer(Map map);
	
	public Map<String,String> selectMaxDataPlayer();

}
