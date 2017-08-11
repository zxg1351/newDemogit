package com.example.demo.controller;

import com.example.demo.common.model.ResultInfo;
import com.example.demo.service.TDepartmentSuperServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/11.
 */
@RestController
@RequestMapping(value = "/tDepartmentSuper")
public class TDepartmentSuperController {

    @Autowired
    private TDepartmentSuperServcie tDepartmentSuperServcie;


    @RequestMapping(value = "/selectAllTDepartmentManager")
    public ResultInfo selectAllTDepartmentManager() {

        ResultInfo resultInfo = tDepartmentSuperServcie.selectAllTDepartmentManager();
        return resultInfo;
    }


    @RequestMapping(value = "/selectTDepartmentManager")
    public ResultInfo selectTDepartmentManager(Integer managerId, String managerName) {

        ResultInfo resultInfo = tDepartmentSuperServcie.selectTDepartmentManager(managerId, managerName);
        return resultInfo;

    }

}
