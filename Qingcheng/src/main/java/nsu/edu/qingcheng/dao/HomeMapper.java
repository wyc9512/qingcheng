package nsu.edu.qingcheng.dao;

import java.util.List;
import nsu.edu.qingcheng.bean.Home;
import nsu.edu.qingcheng.bean.HomeExample;
import org.apache.ibatis.annotations.Param;

public interface HomeMapper {
    long countByExample(HomeExample example);

    int deleteByExample(HomeExample example);

    int deleteByPrimaryKey(Integer homeId);

    int insert(Home record);

    int insertSelective(Home record);

    List<Home> selectByExample(HomeExample example);

    Home selectByPrimaryKey(Integer homeId);

    int updateByExampleSelective(@Param("record") Home record, @Param("example") HomeExample example);

    int updateByExample(@Param("record") Home record, @Param("example") HomeExample example);

    int updateByPrimaryKeySelective(Home record);

    int updateByPrimaryKey(Home record);
}