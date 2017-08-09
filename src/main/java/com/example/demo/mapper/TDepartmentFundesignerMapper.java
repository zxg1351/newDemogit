package com.example.demo.mapper;

import com.example.demo.bean.TDepartmentFundesigner;
import com.example.demo.bean.TDepartmentFundesignerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDepartmentFundesignerMapper {
    long countByExample(TDepartmentFundesignerExample example);

    int deleteByExample(TDepartmentFundesignerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDepartmentFundesigner record);

    int insertSelective(TDepartmentFundesigner record);

    List<TDepartmentFundesigner> selectByExample(TDepartmentFundesignerExample example);

    TDepartmentFundesigner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDepartmentFundesigner record, @Param("example") TDepartmentFundesignerExample example);

    int updateByExample(@Param("record") TDepartmentFundesigner record, @Param("example") TDepartmentFundesignerExample example);

    int updateByPrimaryKeySelective(TDepartmentFundesigner record);

    int updateByPrimaryKey(TDepartmentFundesigner record);
}