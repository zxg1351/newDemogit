package com.example.demo.service.impl;

import com.example.demo.bean.MCity;
import com.example.demo.bean.MCityExample;
import com.example.demo.bean.MProvince;
import com.example.demo.bean.MProvinceExample;
import com.example.demo.common.constant.MessageConstant;
import com.example.demo.common.model.ResultInfo;
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
    //    //查询区域
    @Override
    public String selectArea() {
        String result = "success";

        logger.info("查询区域成功");
        return result;
    }
    //查询城市
    @Override
    public String selectCity(Integer provinceId,String mCityId) {
        String result = "success";
        MCityExample mCityExample = new MCityExample();
        mCityExample.createCriteria().andMCityIdEqualTo(mCityId).andMProvinceIdEqualTo(provinceId);
        List<MCity> mCityList = mCityMapper.selectByExample(mCityExample);
        if (!CollectionUtils.isEmpty(mCityList)){


        }

        logger.info("查询城市成功");
        return result;
    }
    //查询省份
    @Override
    public ResultInfo selectProvince(String provinceName) {
        String mProvincesId ="";
        ResultInfo resultInfo = new ResultInfo();
        MProvinceExample mProvinceExample = new MProvinceExample();

        mProvinceExample.createCriteria().andMProvinceNameEqualTo(provinceName);
        List<MProvince> mProvinces = mProvinceMapper.selectByExample(mProvinceExample);

        if (!CollectionUtils.isEmpty(mProvinces)){

                 mProvincesId = mProvinces.get(0).getProvinceId();

                resultInfo.setResultCode("0");
                resultInfo.setResultMessage("查询成功");
                resultInfo.setAppData(mProvincesId);
                    logger.info("查询省份成功");

        }else {

            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("查询失败");

        }


        return resultInfo;
    }
}

