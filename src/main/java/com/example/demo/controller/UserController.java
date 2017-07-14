package com.example.demo.controller;

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
    public String register(String userName,String passWord){

       String result =  userServcie.register(userName,passWord);

        return result;
    }


    @RequestMapping(value = "/login")

    public String login(String userName,String passWord){

    String result = userServcie.login(userName,passWord);

    return  result;

    }

    @RequestMapping(value = "/forgotPassword")
    public String forgotPassword(String userName,int id,String passWord){

        String result = userServcie.forgotPassword(userName,id,passWord);


        return  result;

    }

    @RequestMapping(value = "/sendVerificationCode")
    public String sendVerificationCode(String userName){

        String result = sendMessageService.sendVerificationCode(userName);

        return result;

    }
}
