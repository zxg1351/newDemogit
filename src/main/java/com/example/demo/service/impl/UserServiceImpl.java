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

import java.util.Date;
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


        String passWordSHA1 = "";
        ResultInfo resultInfo = new ResultInfo();

        //判断用户名是否为空
        if (StringUtils.isEmpty(userName)) {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage(MessageConstant.NON_EXISTENT_USER);

            logger.info("用户名不能为空");
            return resultInfo;
        }
        //判断密码是否为空
        if (StringUtils.isEmpty(passWord)) {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage(MessageConstant.INCORRECT_CREDENTIALS);
            logger.info("密码不能为空");
            return resultInfo;
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
        //判断数据库中是否存在该用户
        if (CollectionUtils.isEmpty(mUserList)) {
            //已存在
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage(MessageConstant.FAILURE);
            resultInfo.setAppData(mUserList);
            logger.info("该用户已注册");

        } else {
            MUser mUser = new MUser();
            mUser.setmUserAccount(userName);//姓名
            mUser.setmUserPassword(passWordSHA1);//密码
            mUser.setCreateTime(new Date());//创建时间
            mUser.setCreateUser(1);//创建人
            int result = mUserMapper.insertSelective(mUser);//插入
            if (result != 0) {

                MUserExample userExample = new MUserExample();
                mUserExample.createCriteria().andMUserNameEqualTo(userName)
                        .andMUserPasswordEqualTo(passWordSHA1);
                List<MUser> mUsersList = mUserMapper.selectByExample(userExample);
                resultInfo.setResultCode("0");
                resultInfo.setResultMessage(MessageConstant.SUCCESS);
                resultInfo.setAppData(mUsersList);
                logger.info("注册成功");

            } else {
                resultInfo.setResultCode("1");
                resultInfo.setResultMessage("注册失败");
                logger.info("注册失败");
            }

        }
        return resultInfo;
    }

    //登录
    @Override
    public ResultInfo login(String userName, String userPassword) {
//        String result  = "success";
        ResultInfo resultInfo = new ResultInfo();
        MUser result = new MUser();
        if (StringUtils.isEmpty(userName)) {
            resultInfo.setResultCode("0");
            resultInfo.setResultMessage("用户名不能为空");
            logger.info("用户名不能为空");
        }
        if (StringUtils.isEmpty(userPassword)) {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("密码不能为空");
            logger.info("密码不能为空");
        }

        try {

            userPassword = SecurityUtil.createSHA1(cryptKey.concat(SecurityUtil.decodeBase64(userPassword)));//
        } catch (Exception e) {
            e.printStackTrace();
        }
        MUserExample mUserExample = new MUserExample();
        mUserExample.createCriteria().andMUserNameEqualTo(userName)
                .andMUserPasswordEqualTo(userPassword);

        List<MUser> mUserList = mUserMapper.selectByExample(mUserExample);
        if (CollectionUtils.isEmpty(mUserList)) {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("用户名或密码错误");
            logger.info("登录失败");
        } else {
            resultInfo.setAppData(mUserList);
            resultInfo.setResultMessage("登录成功");
            resultInfo.setResultCode("0");
            logger.info("登录成功");
        }


        return resultInfo;
    }

    //忘记密码
    @Override
    public ResultInfo forgotPassword(String userName, int id, String passWord,String code) {
        String result = "success";

        ResultInfo resultInfo =  new ResultInfo();

        resultInfo.setResultCode("0");
        resultInfo.setResultMessage("发送成功");


        logger.info("修改密码成功");
        return resultInfo;
    }

    //
}
