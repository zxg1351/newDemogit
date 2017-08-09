package com.example.demo.mapper;

import com.example.demo.bean.TLargeArea;
import com.example.demo.bean.TLargeAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLargeAreaMapper {
    long countByExample(TLargeAreaExample example);

    int deleteByExample(TLargeAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLargeArea record);

    int insertSelective(TLargeArea record);

    List<TLargeArea> selectByExample(TLargeAreaExample example);

    TLargeArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TLargeArea record, @Param("example") TLargeAreaExample example);

    int updateByExample(@Param("record") TLargeArea record, @Param("example") TLargeAreaExample example);

    int updateByPrimaryKeySelective(TLargeArea record);

    int updateByPrimaryKey(TLargeArea record);
}