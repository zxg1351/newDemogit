package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/14.
 */
@Service
public class RegionService {
    private static final Logger logger = LoggerFactory.getLogger(RegionService.class);
    //查询区域
    public  String selectArea(){

        String result = "success";

        logger.info("查询区域成功");
        return result;
    }
    //查询城市
    public  String selectCity(){


        String result = "success";
        logger.info("查询城市成功");
        return result;

    }
    //查询省份
    public  String selectProvince(){

        String result = "success";
        logger.info("查询省份成功");
        return result;
    }

}
