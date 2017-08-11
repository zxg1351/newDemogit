package com.example.demo.controller;

import com.example.demo.common.model.ResultInfo;
import com.example.demo.service.TDepartmentDesignerService;
import com.example.demo.service.TDepartmentFinanceServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/10.
 */

@RestController
@RequestMapping(value = "/tDepartmentFinance")
public class TDepartmentFinanceController {

    @Autowired
    private TDepartmentFinanceServcie tDepartmentFinanceServcie;

    @RequestMapping(value = "/selectAllFinance")
    public ResultInfo selectAllFinance() {
        ResultInfo resultInfo = tDepartmentFinanceServcie.selectAllTDepartmentFinance();
        return resultInfo;
    }


    @RequestMapping(value = "/selectFinance")
    public ResultInfo selectFinance(Integer finance, String financeName) {
        ResultInfo resultInfo = tDepartmentFinanceServcie.selectTDepartmentFinanceByName(finance, financeName);
        return resultInfo;
    }

}
