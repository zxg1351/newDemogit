package com.example.demo.controller;

import com.example.demo.common.model.ResultInfo;
import com.example.demo.service.TDepartmentWorkServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/11.
 */

@RestController
@RequestMapping(value = "/tDepartmentWorkServcie")
public class TDepartmentWorkServcieController {


    @Autowired
    private TDepartmentWorkServcie tDepartmentWorkServcie;


    @RequestMapping(value = "/selectAllWork")
    public ResultInfo selectAllWork() {

        ResultInfo resultInfo = new ResultInfo();

        return resultInfo;

    }

}
