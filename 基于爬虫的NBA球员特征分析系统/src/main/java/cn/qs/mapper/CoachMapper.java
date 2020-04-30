package cn.qs.mapper;

import cn.qs.bean.Coach;
import cn.qs.bean.CoachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoachMapper {
    int countByExample(CoachExample example);

    int deleteByExample(CoachExample example);

    int deleteByPrimaryKey(String coachId);

    int insert(Coach record);

    int insertSelective(Coach record);

    List<Coach> selectByExample(CoachExample example);

    Coach selectByPrimaryKey(String coachId);

    int updateByExampleSelective(@Param("record") Coach record, @Param("example") CoachExample example);

    int updateByExample(@Param("record") Coach record, @Param("example") CoachExample example);

    int updateByPrimaryKeySelective(Coach record);

    int updateByPrimaryKey(Coach record);
}