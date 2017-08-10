package com.example.demo.service.impl;

import com.example.demo.bean.TLargeArea;
import com.example.demo.bean.TLargeAreaExample;
import com.example.demo.common.model.ResultInfo;
import com.example.demo.mapper.TLargeAreaMapper;
import com.example.demo.service.TLargeAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
public class TLargeAreaServiceImpl implements TLargeAreaService {


    @Autowired
    private TLargeAreaMapper tLargeAreaMapper;



    @Override
    public ResultInfo selectTLargeArea(Integer largeAreaId, String largeAreaName) {

        ResultInfo resultInfo = new ResultInfo();

        TLargeAreaExample tLargeAreaExample = new TLargeAreaExample();
        tLargeAreaExample.createCriteria().andLargeAreaIdEqualTo(largeAreaId).andLargeAreaNameEqualTo(largeAreaName);
        List<TLargeArea>  tLargeAreaList = tLargeAreaMapper.selectByExample(tLargeAreaExample);

        if (!CollectionUtils.isEmpty(tLargeAreaList)){

            resultInfo.setResultCode("0");
            resultInfo.setResultMessage("查询成功");
            resultInfo.setAppData(tLargeAreaList);

        }

        return resultInfo;
    }
}
