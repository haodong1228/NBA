package cn.qs.mapper;

import cn.qs.bean.PlayerData;
import cn.qs.bean.PlayerDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlayerDataMapper {
    int countByExample(PlayerDataExample example);

    int deleteByExample(PlayerDataExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PlayerData record);

    int insertSelective(PlayerData record);

    List<PlayerData> selectByExample(PlayerDataExample example);

    PlayerData selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PlayerData record, @Param("example") PlayerDataExample example);

    int updateByExample(@Param("record") PlayerData record, @Param("example") PlayerDataExample example);

    int updateByPrimaryKeySelective(PlayerData record);

    int updateByPrimaryKey(PlayerData record);
}