package com.example.demo.controller;

import com.example.demo.common.model.ResultInfo;
import com.example.demo.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/14.
 */
@RestController
@RequestMapping(value = "/region")
public class RegionController {


    @Autowired
    private RegionService regionService;

    //查询区域
    @RequestMapping(value = "/area")
    public  ResultInfo selectArea(@RequestParam Integer mCityId,@RequestParam String mAreaName){

        ResultInfo result = regionService.selectArea(mCityId,mAreaName);
        return result;
    }
    //查询城市
    @RequestMapping(value = "/city")
    public  ResultInfo selectCity(@RequestParam Integer provinceId,@RequestParam String  mCityName){
        ResultInfo result = regionService.selectCity(provinceId,mCityName);
        return result;

    }
    //查询省份
    @RequestMapping(value = "/province")
    public ResultInfo selectProvince(@RequestParam String provinceName){

        ResultInfo result = regionService.selectProvince(provinceName);
        return result;
    }

}
