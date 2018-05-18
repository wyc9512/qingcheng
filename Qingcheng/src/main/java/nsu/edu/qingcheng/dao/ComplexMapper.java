package nsu.edu.qingcheng.dao;

import java.util.List;
import nsu.edu.qingcheng.bean.Complex;
import nsu.edu.qingcheng.bean.ComplexExample;
import org.apache.ibatis.annotations.Param;

public interface ComplexMapper {
    long countByExample(ComplexExample example);

    int deleteByExample(ComplexExample example);

    int deleteByPrimaryKey(Integer complexId);

    int insert(Complex record);

    int insertSelective(Complex record);

    List<Complex> selectByExampleWithBLOBs(ComplexExample example);

    List<Complex> selectByExample(ComplexExample example);

    Complex selectByPrimaryKey(Integer complexId);

    int updateByExampleSelective(@Param("record") Complex record, @Param("example") ComplexExample example);

    int updateByExampleWithBLOBs(@Param("record") Complex record, @Param("example") ComplexExample example);

    int updateByExample(@Param("record") Complex record, @Param("example") ComplexExample example);

    int updateByPrimaryKeySelective(Complex record);

    int updateByPrimaryKeyWithBLOBs(Complex record);

    int updateByPrimaryKey(Complex record);
}