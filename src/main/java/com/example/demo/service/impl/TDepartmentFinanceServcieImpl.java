package com.example.demo.service.impl;

import com.example.demo.bean.TDepartmentFinance;
import com.example.demo.bean.TDepartmentFinanceExample;
import com.example.demo.common.model.ResultInfo;
import com.example.demo.mapper.TDepartmentFinanceMapper;
import com.example.demo.service.TDepartmentFinanceServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/8/9.
 */
public class TDepartmentFinanceServcieImpl implements TDepartmentFinanceServcie {


    @Autowired
    private TDepartmentFinanceMapper tDepartmentFinanceMapper;


    @Override
    public ResultInfo selectAllTDepartmentFinance() {

        ResultInfo resultInfo = new ResultInfo();

        TDepartmentFinanceExample tDepartmentFinanceExample = new TDepartmentFinanceExample();

        tDepartmentFinanceExample.createCriteria();

        List<TDepartmentFinance> tDepartmentFinanceList = tDepartmentFinanceMapper.selectByExample(tDepartmentFinanceExample);

        if (!CollectionUtils.isEmpty(tDepartmentFinanceList)){
            resultInfo.setResultCode("0");
            resultInfo.setResultMessage("查询成功");
            resultInfo.setAppData(tDepartmentFinanceList);
        }else {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("查询失败");
        }
        return resultInfo;
    }

    @Override
    public ResultInfo selectTDepartmentFinanceByName(Integer finance, String financeName) {



        ResultInfo resultInfo = new ResultInfo();

        TDepartmentFinanceExample tDepartmentFinanceExample = new TDepartmentFinanceExample();

        tDepartmentFinanceExample.createCriteria().andIdEqualTo(finance).andNameEqualTo(financeName);

        List<TDepartmentFinance> departmentFinanceList = tDepartmentFinanceMapper.selectByExample(tDepartmentFinanceExample);

        if (!CollectionUtils.isEmpty(departmentFinanceList)){
            resultInfo.setResultCode("0");
            resultInfo.setResultMessage("查询成功");
            resultInfo.setAppData(departmentFinanceList);
        }else {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("查询失败");
        }
        return resultInfo;
    }
}
