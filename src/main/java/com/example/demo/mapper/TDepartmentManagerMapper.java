package com.example.demo.mapper;

import com.example.demo.bean.TDepartmentManager;
import com.example.demo.bean.TDepartmentManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDepartmentManagerMapper {
    long countByExample(TDepartmentManagerExample example);

    int deleteByExample(TDepartmentManagerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDepartmentManager record);

    int insertSelective(TDepartmentManager record);

    List<TDepartmentManager> selectByExample(TDepartmentManagerExample example);

    TDepartmentManager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDepartmentManager record, @Param("example") TDepartmentManagerExample example);

    int updateByExample(@Param("record") TDepartmentManager record, @Param("example") TDepartmentManagerExample example);

    int updateByPrimaryKeySelective(TDepartmentManager record);

    int updateByPrimaryKey(TDepartmentManager record);
}