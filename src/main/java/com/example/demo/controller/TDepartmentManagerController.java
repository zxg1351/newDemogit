package com.example.demo.controller;

import com.example.demo.common.model.ResultInfo;
import com.example.demo.service.TDepartmentManagerServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/11.
 */

@RestController
@RequestMapping(value = "/tDepartmentManager")
public class TDepartmentManagerController {


    @Autowired
    private TDepartmentManagerServcie tDepartmentManagerServcie;


    @RequestMapping(value = "/selectAllTDepartmentManager")
    public ResultInfo selectAllTDepartmentManager() {

        ResultInfo resultInfo = tDepartmentManagerServcie.selectAllTDepartmentManager();
        return resultInfo;
    }

    @RequestMapping(value = "/selectTDepartmentManager")
    public ResultInfo selectTDepartmentManager(Integer managerId, String managerName) {

        ResultInfo resultInfo = tDepartmentManagerServcie.selectTDepartmentManager(managerId, managerName);
        return resultInfo;
    }


}
