package com.example.demo.service;

import com.example.demo.common.model.ResultInfo;

/**
 * Created by Administrator on 2017/7/18.
 */
public interface RegionService {


    //查询区域
    String selectArea();
    //查询城市
      String selectCity(Integer provinceId,String mCityId);
    //查询省份名称查询省份对应ID
    ResultInfo selectProvince(String provinceName);

}
