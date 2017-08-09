package com.example.demo.mapper;

import com.example.demo.bean.MUserMenu;
import com.example.demo.bean.MUserMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MUserMenuMapper {
    long countByExample(MUserMenuExample example);

    int deleteByExample(MUserMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MUserMenu record);

    int insertSelective(MUserMenu record);

    List<MUserMenu> selectByExample(MUserMenuExample example);

    MUserMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MUserMenu record, @Param("example") MUserMenuExample example);

    int updateByExample(@Param("record") MUserMenu record, @Param("example") MUserMenuExample example);

    int updateByPrimaryKeySelective(MUserMenu record);

    int updateByPrimaryKey(MUserMenu record);
}