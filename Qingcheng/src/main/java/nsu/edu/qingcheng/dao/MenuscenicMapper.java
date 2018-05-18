package nsu.edu.qingcheng.dao;

import java.util.List;
import nsu.edu.qingcheng.bean.Menuscenic;
import nsu.edu.qingcheng.bean.MenuscenicExample;
import org.apache.ibatis.annotations.Param;

public interface MenuscenicMapper {
    long countByExample(MenuscenicExample example);

    int deleteByExample(MenuscenicExample example);

    int deleteByPrimaryKey(Integer menuscenicId);

    int insert(Menuscenic record);

    int insertSelective(Menuscenic record);

    List<Menuscenic> selectByExample(MenuscenicExample example);

    Menuscenic selectByPrimaryKey(Integer menuscenicId);

    int updateByExampleSelective(@Param("record") Menuscenic record, @Param("example") MenuscenicExample example);

    int updateByExample(@Param("record") Menuscenic record, @Param("example") MenuscenicExample example);

    int updateByPrimaryKeySelective(Menuscenic record);

    int updateByPrimaryKey(Menuscenic record);
}