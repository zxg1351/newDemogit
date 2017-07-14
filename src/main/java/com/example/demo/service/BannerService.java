package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/14.
 */
@Service
public class BannerService {

    private static final Logger logger = LoggerFactory.getLogger(BannerService.class);
    public String selectBanner(){

        String result = "success";
        logger.info("成功获取轮播图");
        return result;
    }
}
