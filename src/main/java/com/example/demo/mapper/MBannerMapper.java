package com.example.demo.mapper;

import com.example.demo.bean.MBanner;
import com.example.demo.bean.MBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MBannerMapper {
    long countByExample(MBannerExample example);

    int deleteByExample(MBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MBanner record);

    int insertSelective(MBanner record);

    List<MBanner> selectByExample(MBannerExample example);

    MBanner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MBanner record, @Param("example") MBannerExample example);

    int updateByExample(@Param("record") MBanner record, @Param("example") MBannerExample example);

    int updateByPrimaryKeySelective(MBanner record);

    int updateByPrimaryKey(MBanner record);
}