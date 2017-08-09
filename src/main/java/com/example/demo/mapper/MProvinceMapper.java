package com.example.demo.mapper;

import com.example.demo.bean.MProvince;
import com.example.demo.bean.MProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MProvinceMapper {
    long countByExample(MProvinceExample example);

    int deleteByExample(MProvinceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MProvince record);

    int insertSelective(MProvince record);

    List<MProvince> selectByExample(MProvinceExample example);

    MProvince selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MProvince record, @Param("example") MProvinceExample example);

    int updateByExample(@Param("record") MProvince record, @Param("example") MProvinceExample example);

    int updateByPrimaryKeySelective(MProvince record);

    int updateByPrimaryKey(MProvince record);
}