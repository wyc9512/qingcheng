package nsu.edu.qingcheng.dao;

import java.util.List;
import nsu.edu.qingcheng.bean.Village;
import nsu.edu.qingcheng.bean.VillageExample;
import org.apache.ibatis.annotations.Param;

public interface VillageMapper {
    long countByExample(VillageExample example);

    int deleteByExample(VillageExample example);

    int deleteByPrimaryKey(Integer villageId);

    int insert(Village record);

    int insertSelective(Village record);

    List<Village> selectByExampleWithBLOBs(VillageExample example);

    List<Village> selectByExample(VillageExample example);

    Village selectByPrimaryKey(Integer villageId);

    int updateByExampleSelective(@Param("record") Village record, @Param("example") VillageExample example);

    int updateByExampleWithBLOBs(@Param("record") Village record, @Param("example") VillageExample example);

    int updateByExample(@Param("record") Village record, @Param("example") VillageExample example);

    int updateByPrimaryKeySelective(Village record);

    int updateByPrimaryKeyWithBLOBs(Village record);

    int updateByPrimaryKey(Village record);
}