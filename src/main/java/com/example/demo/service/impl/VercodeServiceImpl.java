package com.example.demo.service.impl;

import com.example.demo.bean.MVercode;
import com.example.demo.common.model.ResultInfo;
import com.example.demo.mapper.MVercodeMapper;
import com.example.demo.service.VericodeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by Administrator on 2017/7/31.
 */
public class VercodeServiceImpl implements VericodeService {

    @Autowired
    private MVercodeMapper mVercodeMapper;

    @Override
    public ResultInfo insertVercode(String verCode, String telephone) {

        ResultInfo resultInfo = new ResultInfo();

        MVercode mVercode = new MVercode();
        mVercode.setmVercode(verCode);
        mVercode.setCreateUser(Integer.valueOf(telephone));
        mVercode.setCreateTime(new Date());

        int result = mVercodeMapper.insertSelective(mVercode);
        if (result!=0){
            resultInfo.setResultCode("0");
            resultInfo.setResultMessage("插入成功");
        }else {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("插入失败");
        }
        return resultInfo;
    }
}
