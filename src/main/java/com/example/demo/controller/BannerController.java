package com.example.demo.controller;

import com.example.demo.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/14.
 */


@RestController
@RequestMapping(value = "/banner")
public class BannerController {


    @Autowired
    private BannerService bannerService;

    @RequestMapping
    public String selectBanner(){

        String result = bannerService.selectBanner();

        return result;

    }

}
