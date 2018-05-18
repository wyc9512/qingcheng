package nsu.edu.qingcheng.dao;

import java.util.List;
import nsu.edu.qingcheng.bean.Residence;
import nsu.edu.qingcheng.bean.ResidenceExample;
import org.apache.ibatis.annotations.Param;

public interface ResidenceMapper {
    long countByExample(ResidenceExample example);

    int deleteByExample(ResidenceExample example);

    int deleteByPrimaryKey(Integer residenceId);

    int insert(Residence record);

    int insertSelective(Residence record);

    List<Residence> selectByExampleWithBLOBs(ResidenceExample example);

    List<Residence> selectByExample(ResidenceExample example);

    Residence selectByPrimaryKey(Integer residenceId);

    int updateByExampleSelective(@Param("record") Residence record, @Param("example") ResidenceExample example);

    int updateByExampleWithBLOBs(@Param("record") Residence record, @Param("example") ResidenceExample example);

    int updateByExample(@Param("record") Residence record, @Param("example") ResidenceExample example);

    int updateByPrimaryKeySelective(Residence record);

    int updateByPrimaryKeyWithBLOBs(Residence record);

    int updateByPrimaryKey(Residence record);
}