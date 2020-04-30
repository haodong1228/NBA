package cn.qs.service.coach;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.qs.bean.Coach;
import cn.qs.mapper.CoachMapper;
import cn.qs.mapper.player.MyCoachMapper;

@Service
@Transactional
public class CoachServiceimpl implements CoachService {

	@Autowired
	private CoachMapper coachMapper;
	@Autowired
	private MyCoachMapper myCoachMapper;
	
	@Override
	public List<Coach> findAllCoach() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coach findCoachByCoachName(String coachName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCoach(Coach coach) {
		coachMapper.insertSelective(coach);
		
	}

	@Override
	public List<Coach> getPlayers(Map condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCoach(String coachId) {
		
		coachMapper.deleteByPrimaryKey(coachId);
	}

	@Override
	public Coach getCoach(String coachId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCoach(Coach coach) {
		coachMapper.updateByPrimaryKeySelective(coach);
		
	}

	@Override
	public List<Coach> selectCoachDetail(Map map) {
		
		return myCoachMapper.selectCoachsByMap(map);
	}

}
