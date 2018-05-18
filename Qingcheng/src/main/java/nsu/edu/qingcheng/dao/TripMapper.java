package nsu.edu.qingcheng.dao;

import java.util.List;
import nsu.edu.qingcheng.bean.Trip;
import nsu.edu.qingcheng.bean.TripExample;
import org.apache.ibatis.annotations.Param;

public interface TripMapper {
    long countByExample(TripExample example);

    int deleteByExample(TripExample example);

    int deleteByPrimaryKey(Integer tripId);

    int insert(Trip record);

    int insertSelective(Trip record);

    List<Trip> selectByExampleWithBLOBs(TripExample example);

    List<Trip> selectByExample(TripExample example);

    Trip selectByPrimaryKey(Integer tripId);

    int updateByExampleSelective(@Param("record") Trip record, @Param("example") TripExample example);

    int updateByExampleWithBLOBs(@Param("record") Trip record, @Param("example") TripExample example);

    int updateByExample(@Param("record") Trip record, @Param("example") TripExample example);

    int updateByPrimaryKeySelective(Trip record);

    int updateByPrimaryKeyWithBLOBs(Trip record);

    int updateByPrimaryKey(Trip record);
}