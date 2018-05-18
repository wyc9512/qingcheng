package nsu.edu.qingcheng.dao;

import java.util.List;
import nsu.edu.qingcheng.bean.Threemenu;
import nsu.edu.qingcheng.bean.ThreemenuExample;
import org.apache.ibatis.annotations.Param;

public interface ThreemenuMapper {
    long countByExample(ThreemenuExample example);

    int deleteByExample(ThreemenuExample example);

    int deleteByPrimaryKey(Integer threemenuId);

    int insert(Threemenu record);

    int insertSelective(Threemenu record);

    List<Threemenu> selectByExample(ThreemenuExample example);

    Threemenu selectByPrimaryKey(Integer threemenuId);

    int updateByExampleSelective(@Param("record") Threemenu record, @Param("example") ThreemenuExample example);

    int updateByExample(@Param("record") Threemenu record, @Param("example") ThreemenuExample example);

    int updateByPrimaryKeySelective(Threemenu record);

    int updateByPrimaryKey(Threemenu record);
}