package com.example.demo.service;

import com.example.demo.common.model.ResultInfo;

/**
 * Created by Administrator on 2017/7/18.
 */
public interface SendMessageService {

     ResultInfo sendVerificationCode(String userName);
}
