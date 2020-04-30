package cn.qs.service.devolop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.qs.bean.Player;
import cn.qs.mapper.player.MyPlayerMapper;

@Service
@Transactional
public class devolopPlanImpl implements devolopPlan {
	
	@Autowired
	private MyPlayerMapper PlayerMapper;

	@Override
	public List<Player> findPlayerInfos(Map condition) {
		
		List<Player> list = PlayerMapper.findPlayerInfos(condition);
		
		return list;
	}

	@Override
	public Map buildDevolopPlan(Map condition) {
		Map map = new HashMap();
		List<Player> list = PlayerMapper.findPlayerInfos(condition);
		if(list == null || list.size() == 0){
			return map;
		}
		Player player = list.get(0);
		String name = player.getName();
		map.put("name", name);
		String height = player.getHeight();
		String weight = player.getWeight();
		// 计算BMI
		String BMI = "";
		String sg = height.substring(0,height.indexOf("米"));
		String tz = weight.substring(0,weight.indexOf("公斤"));
		if(sg !=null && tz != null && !"".equals(sg) && !"".equals(tz)){
			double sgnum = Double.parseDouble(sg);
			
			double tznum = Double.parseDouble(tz);
			if(tznum != 0){
				double bmiNum = tznum/(sgnum*sgnum);
				BMI = ""+bmiNum;
			}
		}
		map.put("bmi", BMI.substring(0, 4));
		//fa qiu  36.8%
		String psrate = (player.getPsHitRate()).replace("%", ""); 
		map.put("psrate", psrate);
		String hittate = (player.getThreeHitRate()).replace("%", "");
		map.put("hittate", hittate);
		String shootrate = (player.getShootHitRate()).replace("%", "");
		map.put("shootrate", shootrate);
		
		return map;
	}
	
	public static void main(String[] args) {
		float bmiNum = (float) (68/(1.75*1.75));
		System.out.println(bmiNum);
	}

}
