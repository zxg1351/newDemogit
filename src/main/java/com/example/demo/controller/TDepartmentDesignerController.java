package com.example.demo.controller;

import com.example.demo.common.model.ResultInfo;
import com.example.demo.service.TDepartmentDesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/10.
 */
@RestController
@RequestMapping(value = "/tdepartment")
public class TDepartmentDesignerController {
    @Autowired
    private TDepartmentDesignerService tDepartmentDesignerService;

    @RequestMapping(value = "/selectAllDesigner")
    public ResultInfo selectAllDesigner() {
        ResultInfo resultInfo = tDepartmentDesignerService.selectAllDesigner();

        return resultInfo;
    }

    @RequestMapping(value = "/selectDesigner")
    public ResultInfo selectDesigner(@RequestParam Integer designerId, @RequestParam String designerName) {

        ResultInfo resultInfo = tDepartmentDesignerService.selectDesigner(designerId, designerName);
        return resultInfo;
    }

}
