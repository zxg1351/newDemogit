package com.example.demo.controller;

import com.example.demo.common.model.ResultInfo;
import com.example.demo.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/14.
 */


@RestController
@RequestMapping(value = "/banner")
public class BannerController {


    @Autowired
    private BannerService bannerService;

    @RequestMapping(value = "/banner")
    public ResultInfo selectBanner(@RequestParam  String mBannerType){

        ResultInfo result = bannerService.selectBanner(mBannerType);

        return result;

    }

    @RequestMapping(value = "/welcome")
    public ResultInfo selectWelcomePage(@RequestParam  String mBannerType){

        ResultInfo result = bannerService.selectWelcomePage(mBannerType);

        return result;

    }

}
