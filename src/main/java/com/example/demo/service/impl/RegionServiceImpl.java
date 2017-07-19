package com.example.demo.service.impl;

import com.example.demo.service.RegionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2017/7/18.
 */
public class RegionServiceImpl implements RegionService {

    private static final Logger logger = LoggerFactory.getLogger(RegionServiceImpl.class);

    //    //查询区域
    @Override
    public String selectArea() {
        String result = "success";

        logger.info("查询区域成功");
        return result;
    }
    //查询城市
    @Override
    public String selectCity() {
        String result = "success";
        logger.info("查询城市成功");
        return result;
    }
    //查询省份
    @Override
    public String selectProvince() {
        String result = "success";
        logger.info("查询省份成功");
        return result;
    }
}

