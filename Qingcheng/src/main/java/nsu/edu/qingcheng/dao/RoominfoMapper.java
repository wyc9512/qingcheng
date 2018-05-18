package nsu.edu.qingcheng.dao;

import java.util.List;
import nsu.edu.qingcheng.bean.Roominfo;
import nsu.edu.qingcheng.bean.RoominfoExample;
import org.apache.ibatis.annotations.Param;

public interface RoominfoMapper {
    long countByExample(RoominfoExample example);

    int deleteByExample(RoominfoExample example);

    int deleteByPrimaryKey(Integer roominfoId);

    int insert(Roominfo record);

    int insertSelective(Roominfo record);

    List<Roominfo> selectByExample(RoominfoExample example);

    Roominfo selectByPrimaryKey(Integer roominfoId);

    int updateByExampleSelective(@Param("record") Roominfo record, @Param("example") RoominfoExample example);

    int updateByExample(@Param("record") Roominfo record, @Param("example") RoominfoExample example);

    int updateByPrimaryKeySelective(Roominfo record);

    int updateByPrimaryKey(Roominfo record);
}