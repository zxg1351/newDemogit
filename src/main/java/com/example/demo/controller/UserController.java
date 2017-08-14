package com.example.demo.controller;

import com.example.demo.common.model.ResultInfo;
import com.example.demo.service.SendMessageService;
import com.example.demo.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/14.
 */

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserServcie userServcie;

    @Autowired
    private SendMessageService sendMessageService;

    @RequestMapping(value = "/register")
    public ResultInfo register(String userName, String passWord) {

        ResultInfo result = userServcie.register(userName, passWord);

        return result;
    }


    @RequestMapping(value = "/login")
    public ResultInfo login(String userName, String passWord) {

        ResultInfo result = userServcie.login(userName, passWord);

        return result;

    }

    @RequestMapping(value = "/forgotPassword")
    public ResultInfo forgotPassword(String userName, int id, String passWord,String code) {

        ResultInfo result = userServcie.forgotPassword(userName, id, passWord,code);


        return result;

    }

    /**
     * 发送短信验证码
     * @param userName
     * @return
     */
    @RequestMapping(value = "/sendVerificationCode")
    public ResultInfo sendVerificationCode(String userName) {

        ResultInfo result = sendMessageService.sendVerificationCode(userName);

        return result;

    }
}
