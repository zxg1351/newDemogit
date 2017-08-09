package com.example.demo.mapper;

import com.example.demo.bean.TDepartmentSuper;
import com.example.demo.bean.TDepartmentSuperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDepartmentSuperMapper {
    long countByExample(TDepartmentSuperExample example);

    int deleteByExample(TDepartmentSuperExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDepartmentSuper record);

    int insertSelective(TDepartmentSuper record);

    List<TDepartmentSuper> selectByExample(TDepartmentSuperExample example);

    TDepartmentSuper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDepartmentSuper record, @Param("example") TDepartmentSuperExample example);

    int updateByExample(@Param("record") TDepartmentSuper record, @Param("example") TDepartmentSuperExample example);

    int updateByPrimaryKeySelective(TDepartmentSuper record);

    int updateByPrimaryKey(TDepartmentSuper record);
}