package com.example.demo.service.impl;

import com.example.demo.service.SendMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2017/7/18.
 */
public class SendMessageServiceImpl implements SendMessageService{

    private static final Logger logger = LoggerFactory.getLogger(SendMessageServiceImpl.class);
    @Override
    public String sendVerificationCode(String userName) {
        //需要新建表
        String result  = "success";
        logger.info("成功发送验证码");
        return result;
    }


}