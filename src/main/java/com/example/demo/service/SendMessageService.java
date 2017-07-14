package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/14.
 */
@Service
public class SendMessageService {

    private static final Logger logger = LoggerFactory.getLogger(SendMessageService.class);

    public String sendVerificationCode(String userName){

        //需要新建表
        String result  = "success";
        logger.info("成功发送验证码");
        return result;
    }
}
