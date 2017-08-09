package com.example.demo.mapper;

import com.example.demo.bean.TDepartmentDesigner;
import com.example.demo.bean.TDepartmentDesignerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDepartmentDesignerMapper {
    long countByExample(TDepartmentDesignerExample example);

    int deleteByExample(TDepartmentDesignerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDepartmentDesigner record);

    int insertSelective(TDepartmentDesigner record);

    List<TDepartmentDesigner> selectByExample(TDepartmentDesignerExample example);

    TDepartmentDesigner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDepartmentDesigner record, @Param("example") TDepartmentDesignerExample example);

    int updateByExample(@Param("record") TDepartmentDesigner record, @Param("example") TDepartmentDesignerExample example);

    int updateByPrimaryKeySelective(TDepartmentDesigner record);

    int updateByPrimaryKey(TDepartmentDesigner record);
}