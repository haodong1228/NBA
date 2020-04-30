package cn.qs.service.devolop;

import java.util.List;
import java.util.Map;

import cn.qs.bean.Player;

public interface devolopPlan {

	public List<Player> findPlayerInfos(Map condition);
	
	public Map buildDevolopPlan(Map condition);
	
}
