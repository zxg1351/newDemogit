package com.example.demo.service;

import com.example.demo.common.model.ResultInfo;

/**
 * Created by Administrator on 2017/7/18.
 */
public interface RegionService {


    //查询区域
    ResultInfo selectArea(Integer mCityId, String mAreaName);
    //查询城市
    ResultInfo selectCity(Integer provinceId,String mCityName);
    //查询省份名称查询省份对应ID
    ResultInfo selectProvince(String provinceName);

}
