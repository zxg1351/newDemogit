package com.example.demo.service.impl;

import com.example.demo.bean.MUser;
import com.example.demo.bean.MUserExample;
import com.example.demo.common.constant.MessageConstant;
import com.example.demo.common.model.ResultInfo;
import com.example.demo.common.util.SecurityUtil;
import com.example.demo.mapper.MUserMapper;
import com.example.demo.service.UserServcie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/7/18.
 */
public class UserServiceImpl implements UserServcie {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Value("${crypt.key}")
    private String cryptKey;


    @Autowired
    private MUserMapper mUserMapper;
    //注册
    @Override
    public ResultInfo register(String userName, String passWord) {
        String result  = "success";
        MUser mUser = new MUser();
        String passWordSHA1 = "";
        ResultInfo resultInfo = new ResultInfo();
        if (StringUtils.isEmpty(userName)){
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage(MessageConstant.NON_EXISTENT_USER);
            logger.info("用户名不能为空");
        }

        if (StringUtils.isEmpty(passWord)){
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage(MessageConstant.INCORRECT_CREDENTIALS);
            logger.info("密码不能为空");
        }
        try {
            passWordSHA1 = SecurityUtil.createSHA1(cryptKey.concat((SecurityUtil.decodeBase64(passWord))));
        } catch (Exception e) {

            logger.info("无法解析密码");
            e.printStackTrace();
        }
        MUserExample mUserExample = new MUserExample();
        mUserExample.createCriteria().andMUserNameEqualTo(userName)
                .andMUserPasswordEqualTo(passWordSHA1);

        List<MUser> mUserList = mUserMapper.selectByExample(mUserExample);

        if (CollectionUtils.isEmpty(mUserList)){

            resultInfo.setResultCode("1");
            resultInfo.setResultMessage(MessageConstant.FAILURE);
            resultInfo.setAppData(mUserList);
            logger.info("注册失败");

        }else {
            resultInfo.setResultCode("0");
            resultInfo.setResultMessage(MessageConstant.SUCCESS);
            resultInfo.setAppData(mUserList);
            logger.info("注册成功");
        }
        return resultInfo;
    }
    //登录
    @Override
    public ResultInfo login(String userName, String userPassword) {
//        String result  = "success";
        ResultInfo resultInfo = new ResultInfo();
         MUser result = new MUser();
        if (StringUtils.isEmpty(userName)){
            resultInfo.setResultMessage("用户名不能为空");
        }

        if (StringUtils.isEmpty(userPassword)){
            resultInfo.setResultMessage("密码不能为空");
        }

        try {
            userPassword = SecurityUtil.createSHA1(cryptKey.concat(SecurityUtil.decodeBase64(userPassword)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        MUserExample mUserExample = new MUserExample();
        mUserExample.createCriteria().andMUserNameEqualTo(userName)
                .andMUserPasswordEqualTo(userPassword);

        List<MUser> mUserList = mUserMapper.selectByExample(mUserExample);
        if (CollectionUtils.isEmpty(mUserList)){
            resultInfo.setResultMessage("用户名或密码错误");
            logger.info("登录成功");
        }else{
            resultInfo.setAppData(mUserList);
            resultInfo.setResultMessage("登录成功");
            resultInfo.setResultCode("0");
            logger.info("登录成功");
        }


        return resultInfo;
    }
    //忘记密码
    @Override
    public String forgotPassword(String userName, int id, String passWord) {
        String result  = "success";
        logger.info("修改密码成功");
        return result;
    }

//
}
