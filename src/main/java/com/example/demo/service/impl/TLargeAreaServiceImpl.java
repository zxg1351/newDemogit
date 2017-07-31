package com.example.demo.service.impl;

import com.example.demo.bean.TLargeArea;
import com.example.demo.bean.TLargeAreaExample;
import com.example.demo.common.model.ResultInfo;
import com.example.demo.mapper.TLargeAreaMapper;
import com.example.demo.service.TLargeAreaService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/7/31.
 */
public class TLargeAreaServiceImpl implements TLargeAreaService {


    @Autowired
    private TLargeAreaMapper tLargeAreaMapper;



    @Override
    public ResultInfo selectTLargeArea(Integer largeAreaId, String largeAreaName) {
        TLargeArea tLargeArea = new TLargeArea();

//        TLargeAreaExample tLargeAreaExample = new TLargeAreaExample();
//        tLargeAreaExample.createCriteria().



        return null;
    }
}
