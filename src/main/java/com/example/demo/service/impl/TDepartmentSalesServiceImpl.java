package com.example.demo.service.impl;

import com.example.demo.bean.TDepartmentSales;
import com.example.demo.bean.TDepartmentSalesExample;
import com.example.demo.common.model.ResultInfo;
import com.example.demo.mapper.TDepartmentSalesMapper;
import com.example.demo.service.TDepartmentSalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/8/8.
 */
public class TDepartmentSalesServiceImpl implements TDepartmentSalesService
{

    @Autowired
    private TDepartmentSalesMapper tDepartmentSalesMapper;




    @Override
    public ResultInfo selectAllSales() {
        ResultInfo resultInfo = new ResultInfo();


        TDepartmentSalesExample tDepartmentSalesExample = new TDepartmentSalesExample();
        tDepartmentSalesExample.createCriteria();

       List<TDepartmentSales> tDepartmentSalesList = tDepartmentSalesMapper.selectByExample(tDepartmentSalesExample);

        if (!CollectionUtils.isEmpty(tDepartmentSalesList)){


            resultInfo.setResultCode("0");
            resultInfo.setResultMessage("查询成功");
            resultInfo.setAppData(tDepartmentSalesList);

        }else {

            resultInfo.setResultMessage("查询失败");
            resultInfo.setResultCode("1");

        }



        return resultInfo;
    }

    @Override
    public ResultInfo selectSales(Integer salesId, String salseName) {

        ResultInfo resultInfo = new ResultInfo();


        TDepartmentSalesExample tDepartmentSalesExample = new TDepartmentSalesExample();
        tDepartmentSalesExample.createCriteria().andMUserIdEqualTo(salesId).andSaleNameEqualTo(salseName);

        List<TDepartmentSales> departmentSalesList = tDepartmentSalesMapper.selectByExample(tDepartmentSalesExample);

        if (!CollectionUtils.isEmpty(departmentSalesList)){


            resultInfo.setResultCode("0");
            resultInfo.setResultMessage("查询成功");
            resultInfo.setAppData(departmentSalesList);

        }else {

            resultInfo.setResultMessage("查询失败");
            resultInfo.setResultCode("1");

        }

        return resultInfo;
    }
}
