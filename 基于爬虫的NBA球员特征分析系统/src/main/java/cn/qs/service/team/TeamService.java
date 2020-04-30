package cn.qs.service.team;

import java.util.List;
import java.util.Map;

import cn.qs.bean.Team;

public interface TeamService {
	/**
	 * 根据接口查询
	 */
	public List<Team> findAllTeam();
	
	public Team findTeamByTeamName(String teamName);

	public void addTeam(Team team);

	public List<Team> getTeams(Map condition);

	public void deleteTeam(String teamId);

	public Team getTeam(String teamId);

	public void updateTeam(Team team);
}
