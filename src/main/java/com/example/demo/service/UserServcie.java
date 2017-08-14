package com.example.demo.service;

import com.example.demo.common.model.ResultInfo;

/**
 * Created by Administrator on 2017/7/18.
 */
public interface UserServcie {

    /**
     * 注册
     * @param userName
     * @param passWord
     * @return
     */
    ResultInfo register(String userName, String passWord);


    /**
     * 登录
     * @param userName
     * @param passWord
     * @return
     */
     ResultInfo login(String userName,String passWord);

    /**
     * 忘记密码
     * @param userName
     * @param id
     * @param passWord
     * @return
     */
    ResultInfo forgotPassword(String userName,int id,String passWord,String code);
}
