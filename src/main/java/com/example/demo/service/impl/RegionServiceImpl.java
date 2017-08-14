package com.example.demo.service.impl;

import com.example.demo.bean.*;
import com.example.demo.common.constant.MessageConstant;
import com.example.demo.common.model.ResultInfo;
import com.example.demo.mapper.MAreaMapper;
import com.example.demo.mapper.MCityMapper;
import com.example.demo.mapper.MProvinceMapper;
import com.example.demo.service.RegionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/7/18.
 */
public class RegionServiceImpl implements RegionService {

    private static final Logger logger = LoggerFactory.getLogger(RegionServiceImpl.class);

    @Autowired
    private MCityMapper mCityMapper;
    @Autowired
    private MProvinceMapper mProvinceMapper;
    @Autowired
    private MAreaMapper mAreaMapper;

    //    //查询区域
    @Override
    public ResultInfo selectArea(Integer mCityId, String mAreaName) {

        ResultInfo resultInfo = new ResultInfo();

        MAreaExample mAreaExample = new MAreaExample();
        mAreaExample.createCriteria().andMCityIdEqualTo(mCityId).andMAreaNameEqualTo(mAreaName);


        List<MArea> mAreaList = mAreaMapper.selectByExample(mAreaExample);

        if (!CollectionUtils.isEmpty(mAreaList)){

            resultInfo.setResultCode("0");
            resultInfo.setResultMessage("查询成功");
            resultInfo.setAppData(mAreaList);
            logger.info("查询区域成功");
        }else {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("查询失败");
            logger.info("查询区域失败");
        }
        return resultInfo;
    }

    //查询城市
    @Override
    public ResultInfo selectCity(Integer provinceId, String mCityName) {
        ResultInfo resultInfo = new ResultInfo();
        MCityExample mCityExample = new MCityExample();
        mCityExample.createCriteria().andMCityNameEqualTo(mCityName).andMProvinceIdEqualTo(provinceId);
        List<MCity> mCityList = mCityMapper.selectByExample(mCityExample);
        if (!CollectionUtils.isEmpty(mCityList)) {

            resultInfo.setResultCode("0");
            resultInfo.setResultMessage("查询成功");
            resultInfo.setAppData(mCityList);
            logger.info("查询成功");
        }else {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("查询失败");
            logger.info("查询失败");
        }

        return resultInfo;
    }

    //查询省份
    @Override
    public ResultInfo selectProvince(String provinceName) {
        ResultInfo resultInfo = new ResultInfo();
        MProvinceExample mProvinceExample = new MProvinceExample();

        mProvinceExample.createCriteria().andMProvinceNameEqualTo(provinceName);
        List<MProvince> mProvinces = mProvinceMapper.selectByExample(mProvinceExample);

        if (!CollectionUtils.isEmpty(mProvinces)) {
            resultInfo.setResultCode("0");
            resultInfo.setResultMessage("查询成功");
            resultInfo.setAppData(mProvinces);
            logger.info("查询省份成功");

        } else {

            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("查询失败");
            logger.info("查询失败");
        }
        return resultInfo;
    }
}

