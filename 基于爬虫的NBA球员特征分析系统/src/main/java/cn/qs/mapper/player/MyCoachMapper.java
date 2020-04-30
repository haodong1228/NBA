package cn.qs.mapper.player;

import java.util.List;
import java.util.Map;

import cn.qs.bean.Coach;

public interface MyCoachMapper {
	List<Coach> selectCoachsByMap(Map map);
}
