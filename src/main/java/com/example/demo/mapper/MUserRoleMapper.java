package com.example.demo.mapper;

import com.example.demo.bean.MUserRole;
import com.example.demo.bean.MUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MUserRoleMapper {
    long countByExample(MUserRoleExample example);

    int deleteByExample(MUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MUserRole record);

    int insertSelective(MUserRole record);

    List<MUserRole> selectByExample(MUserRoleExample example);

    MUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MUserRole record, @Param("example") MUserRoleExample example);

    int updateByExample(@Param("record") MUserRole record, @Param("example") MUserRoleExample example);

    int updateByPrimaryKeySelective(MUserRole record);

    int updateByPrimaryKey(MUserRole record);
}