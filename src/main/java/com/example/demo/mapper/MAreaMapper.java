package com.example.demo.mapper;

import com.example.demo.bean.MArea;
import com.example.demo.bean.MAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MAreaMapper {
    long countByExample(MAreaExample example);

    int deleteByExample(MAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MArea record);

    int insertSelective(MArea record);

    List<MArea> selectByExample(MAreaExample example);

    MArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MArea record, @Param("example") MAreaExample example);

    int updateByExample(@Param("record") MArea record, @Param("example") MAreaExample example);

    int updateByPrimaryKeySelective(MArea record);

    int updateByPrimaryKey(MArea record);
}