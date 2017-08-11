package com.example.demo.controller;

import com.example.demo.common.model.ResultInfo;
import com.example.demo.service.TDepartmentManagerServcie;
import com.example.demo.service.TDepartmentSalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/11.
 */
@RestController
@RequestMapping(value = "/tDepartmentSales")
public class TDepartmentSalesController {


    @Autowired
    private TDepartmentSalesService tDepartmentSalesService;


    @RequestMapping(value = "/selectAllSales")
    public ResultInfo selectAllSales() {

        ResultInfo resultInfo = tDepartmentSalesService.selectAllSales();
        return resultInfo;
    }

    @RequestMapping(value = "/selectSales")
    public ResultInfo selectSales(Integer salesId, String salseName) {

        ResultInfo resultInfo = tDepartmentSalesService.selectSales(salesId, salseName);
        return resultInfo;
    }
}
