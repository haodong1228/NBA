package cn.qs.service.team;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.qs.bean.Team;
import cn.qs.bean.TeamExample;
import cn.qs.bean.TeamExample.Criteria;
import cn.qs.mapper.TeamMapper;

@Service
@Transactional
public class TeamServiceImpl implements TeamService{

	@Autowired
	private TeamMapper teamMapper;
	
	@Override
	public List<Team> findAllTeam() {
		TeamExample teamExample = new TeamExample();
		//Criteria createCriteria = teamExample.createCriteria();
		List<Team> list = teamMapper.selectByExample(teamExample);
		return list;
	}

	@Override
	public Team findTeamByTeamName(String teamName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTeam(Team team) {
		teamMapper.insertSelective(team);
	}

	@Override
	public List<Team> getTeams(Map condition) {

		TeamExample teamExample = new TeamExample();
		String tiaojian = (String)condition.get("tiaojian");
		if(tiaojian==null || "".equals(tiaojian)){
			tiaojian = "defen";
		}
		String orderBy = "";
		switch(tiaojian){
			case "defen":orderBy="Average_score";
			break;
			case "zhugong":orderBy="Average_Assists";
			break;
			case "lanban":orderBy="Average_backboard";
			break;
			case "shifen":orderBy="Average_lose_score";
			break;
			case "shiwu":orderBy="Average_error";
			break;
		}
		orderBy = orderBy+"+0 desc";
		System.out.println("orderby:"+orderBy);
		teamExample.setOrderByClause(orderBy);
		Criteria createCriteria = teamExample.createCriteria();
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "teamName"))) {
			
			createCriteria.andTeamNameLike("%" + MapUtils.getString(condition, "teamName") + "%");
		}
		List<Team> list = teamMapper.selectByExample(teamExample);
		return list;
	
	}

	@Override
	public void deleteTeam(String teamId) {
		teamMapper.deleteByPrimaryKey(teamId);
		
	}

	@Override
	public Team getTeam(String teamId) {
		
		return teamMapper.selectByPrimaryKey(teamId);
	}

	@Override
	public void updateTeam(Team team) {
		
		teamMapper.updateByPrimaryKeySelective(team);
	}

}
