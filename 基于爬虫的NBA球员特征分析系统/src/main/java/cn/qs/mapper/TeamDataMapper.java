package cn.qs.mapper;

import cn.qs.bean.TeamData;
import cn.qs.bean.TeamDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamDataMapper {
    int countByExample(TeamDataExample example);

    int deleteByExample(TeamDataExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TeamData record);

    int insertSelective(TeamData record);

    List<TeamData> selectByExample(TeamDataExample example);

    TeamData selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TeamData record, @Param("example") TeamDataExample example);

    int updateByExample(@Param("record") TeamData record, @Param("example") TeamDataExample example);

    int updateByPrimaryKeySelective(TeamData record);

    int updateByPrimaryKey(TeamData record);
}