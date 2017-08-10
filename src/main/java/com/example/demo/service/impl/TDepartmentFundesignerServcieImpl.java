package com.example.demo.service.impl;

import com.example.demo.bean.TDepartmentFundesigner;
import com.example.demo.bean.TDepartmentFundesignerExample;
import com.example.demo.bean.TDepartmentManager;
import com.example.demo.common.model.ResultInfo;
import com.example.demo.mapper.TDepartmentFundesignerMapper;
import com.example.demo.service.TDepartmentFundesignerServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/8/9.
 */
public class TDepartmentFundesignerServcieImpl implements TDepartmentFundesignerServcie {

    @Autowired
    private  TDepartmentFundesignerMapper tDepartmentFundesignerMapper;


    @Override
    public ResultInfo selectAllTDepartmentFundesigner() {


        ResultInfo resultInfo = new ResultInfo();

        TDepartmentFundesignerExample tDepartmentFundesignerExample = new TDepartmentFundesignerExample();

        tDepartmentFundesignerExample.createCriteria();


        List<TDepartmentFundesigner> tDepartmentFundesignerList = tDepartmentFundesignerMapper.selectByExample(tDepartmentFundesignerExample);
        if (!CollectionUtils.isEmpty(tDepartmentFundesignerList)){

            resultInfo.setResultMessage("查询成功");
            resultInfo.setResultCode("0");
            resultInfo.setAppData(tDepartmentFundesignerList);

        }else {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("查询失败");
        }
        return resultInfo;
    }

    @Override
    public ResultInfo selectTDepartmentFundesigner(Integer fundesigner, String fundesignerName) {

        ResultInfo resultInfo = new ResultInfo();

        TDepartmentFundesignerExample tDepartmentFundesignerExample = new TDepartmentFundesignerExample();
        tDepartmentFundesignerExample.createCriteria().andIdEqualTo(fundesigner).andNameEqualTo(fundesignerName);
        List<TDepartmentFundesigner> departmentFundesignerList = tDepartmentFundesignerMapper.selectByExample(tDepartmentFundesignerExample);
        if (!CollectionUtils.isEmpty(departmentFundesignerList)){

            resultInfo.setResultMessage("查询成功");
            resultInfo.setResultCode("0");
            resultInfo.setAppData(departmentFundesignerList);

        }else {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("查询失败");
        }
        return resultInfo;
    }
}
