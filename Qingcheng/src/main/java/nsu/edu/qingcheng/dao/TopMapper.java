package nsu.edu.qingcheng.dao;

import java.util.List;
import nsu.edu.qingcheng.bean.Top;
import nsu.edu.qingcheng.bean.TopExample;
import org.apache.ibatis.annotations.Param;

public interface TopMapper {
    long countByExample(TopExample example);

    int deleteByExample(TopExample example);

    int deleteByPrimaryKey(Integer topId);

    int insert(Top record);

    int insertSelective(Top record);

    List<Top> selectByExample(TopExample example);

    Top selectByPrimaryKey(Integer topId);

    int updateByExampleSelective(@Param("record") Top record, @Param("example") TopExample example);

    int updateByExample(@Param("record") Top record, @Param("example") TopExample example);

    int updateByPrimaryKeySelective(Top record);

    int updateByPrimaryKey(Top record);
}