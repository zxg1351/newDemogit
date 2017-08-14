package com.example.demo.service.impl;

import com.example.demo.bean.MBanner;
import com.example.demo.bean.MBannerExample;
import com.example.demo.common.model.ResultInfo;
import com.example.demo.mapper.MBannerMapper;
import com.example.demo.service.BannerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 根据轮播图类别"0":"轮播图查询"，"1":"查询欢迎页"
 */
public class BannerServiceImpl implements BannerService {

    private static final Logger logger = LoggerFactory.getLogger(BannerServiceImpl.class);

    @Autowired
    private MBannerMapper mBannerMapper;

    /**
     * "0":"轮播图查询"
     * @param mBannerType
     * @return
     */
    @Override
    public ResultInfo selectBanner(String mBannerType) {
        ResultInfo resultInfo = new ResultInfo();
        MBannerExample mBannerExample = new MBannerExample();
        mBannerExample.createCriteria().andMBannerTypeEqualTo(mBannerType);
        List<MBanner> mBannerList = mBannerMapper.selectByExample(mBannerExample);

        if (!CollectionUtils.isEmpty(mBannerList)) {
            resultInfo.setResultCode("0");
            resultInfo.setResultMessage("查询成功");
            resultInfo.setAppData(mBannerList);
            logger.info("查询轮播图成功");
        } else {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("查询失败");
            logger.info("查询轮播图失败");

        }
        return resultInfo;
    }

    /**
     * "1":"查询欢迎页"
     * @param mBannerType
     * @return
     */
    @Override
    public ResultInfo selectWelcomePage(String mBannerType) {
        ResultInfo resultInfo = new ResultInfo();
        MBannerExample mBannerExample = new MBannerExample();
        mBannerExample.createCriteria().andMBannerTypeEqualTo(mBannerType);
        List<MBanner> mBannerList = mBannerMapper.selectByExample(mBannerExample);
        if (!CollectionUtils.isEmpty(mBannerList)) {
            resultInfo.setResultCode("0");
            resultInfo.setResultMessage("查询成功");
            resultInfo.setAppData(mBannerList);
            logger.info("查询欢迎页成功");
        } else {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("查询失败");

            logger.info("查询欢迎页失败");
        }
        return resultInfo;
    }
}
