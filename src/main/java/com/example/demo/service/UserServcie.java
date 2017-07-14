package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/14.
 */
@Service
public class UserServcie {

    private static final Logger logger = LoggerFactory.getLogger(UserServcie.class);
    /**
     * 注册
     * @param userName
     * @param passWord
     * @return
     */
    public String register(String userName,String passWord){
        String result  = "success";



        logger.info("注册成功");
        return result;
    }


    /**
     * 登录
     * @param userName
     * @param passWord
     * @return
     */
    public String login(String userName,String passWord){
        String result  = "success";


        logger.info("登录成功");
        return result;


    }

    /**
     * 忘记密码
     * @param userName
     * @param id
     * @param passWord
     * @return
     */
    public String forgotPassword(String userName,int id,String passWord){
        String result  = "success";
        logger.info("修改密码成功");
        return result;
    }
}
