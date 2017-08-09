package com.example.demo.mapper;

import com.example.demo.bean.MMenu;
import com.example.demo.bean.MMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MMenuMapper {
    long countByExample(MMenuExample example);

    int deleteByExample(MMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MMenu record);

    int insertSelective(MMenu record);

    List<MMenu> selectByExample(MMenuExample example);

    MMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MMenu record, @Param("example") MMenuExample example);

    int updateByExample(@Param("record") MMenu record, @Param("example") MMenuExample example);

    int updateByPrimaryKeySelective(MMenu record);

    int updateByPrimaryKey(MMenu record);
}