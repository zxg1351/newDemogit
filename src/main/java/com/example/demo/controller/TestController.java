package com.example.demo.controller;

import com.example.demo.bean.MUser;
import com.example.demo.bean.MUserExample;
import com.example.demo.mapper.MUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/7/13.
 */

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private MUserMapper userMapper;


    @RequestMapping(value = "/login")
    public String  selectByTelPhone(){


        String telPhone = "13464111739";

        MUserExample mUserExample = new MUserExample();
        mUserExample.createCriteria().andMUserAccountEqualTo(telPhone);


        List<MUser> mUsers = userMapper.selectByExample(mUserExample);
        return "success";
    }
}
