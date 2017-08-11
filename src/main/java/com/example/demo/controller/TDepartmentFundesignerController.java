package com.example.demo.controller;

import com.example.demo.common.model.ResultInfo;
import com.example.demo.service.TDepartmentFundesignerServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/11.
 */
@RestController
@RequestMapping(value = "/tDepartmentFundesigner")
public class TDepartmentFundesignerController {


    @Autowired
    private TDepartmentFundesignerServcie tDepartmentFundesignerServcie;


    @RequestMapping(value = "/selectAllFundeisgner")
    public ResultInfo selectAllFundeisgner() {

        ResultInfo resultInfo = tDepartmentFundesignerServcie.selectAllTDepartmentFundesigner();
        return resultInfo;

    }
    @RequestMapping(value = "/selectFundeisgner")
    public ResultInfo selectFundeisgner(Integer fundesigner,String fundesignerName) {

        ResultInfo resultInfo = tDepartmentFundesignerServcie.selectTDepartmentFundesigner(fundesigner,fundesignerName);
        return resultInfo;

    }

}
