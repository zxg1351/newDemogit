package com.example.demo.service.impl;

import com.example.demo.bean.TDepartmentFundesignerExample;
import com.example.demo.bean.TDepartmentManager;
import com.example.demo.common.model.ResultInfo;
import com.example.demo.mapper.TDepartmentFundesignerMapper;
import com.example.demo.service.TDepartmentFundesignerServcie;
import org.springframework.beans.factory.annotation.Autowired;

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
        return null;
    }

    @Override
    public ResultInfo selectTDepartmentFundesigner(Integer fundesigner, String fundesignerName) {
        return null;
    }
}
