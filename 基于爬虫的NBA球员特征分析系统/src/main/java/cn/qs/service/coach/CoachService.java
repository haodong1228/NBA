package cn.qs.service.coach;

import java.util.List;
import java.util.Map;

import cn.qs.bean.Coach;
import cn.qs.bean.Player;

public interface CoachService {
	/**
	 * 根据接口查询
	 */
	public List<Coach> findAllCoach();
	
	public Coach findCoachByCoachName(String coachName);

	public void addCoach(Coach coach);

	public List<Coach> getPlayers(Map condition);

	public void deleteCoach(String coachId);

	public Coach getCoach(String coachId);

	public void updateCoach(Coach coach);
	
	public List<Coach> selectCoachDetail(Map map);
}
