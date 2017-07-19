package com.example.demo.service.impl;

import com.example.demo.service.BannerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Administrator on 2017/7/18.
 */
public class BannerServiceImpl implements BannerService{

    private static final Logger logger = LoggerFactory.getLogger(BannerServiceImpl.class);


    @Value("${crypt.key}")
    private String cryptKey;
    @Override
    public String selectBanner() {

        String result = "success";
        logger.info("查询轮播图成功");
        return result;
    }

    @Override
    public String selectWelcomePage() {
        String result = "success";
        logger.info("查询欢迎页成功");
        return result;
    }
}
