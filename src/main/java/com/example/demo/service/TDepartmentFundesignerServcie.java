package com.example.demo.service;

import com.example.demo.common.model.ResultInfo;

/**
 * Created by Administrator on 2017/8/8.
 */
public interface TDepartmentFundesignerServcie {


    ResultInfo selectAllTDepartmentFundesigner();

    ResultInfo selectTDepartmentFundesigner(Integer fundesigner,String fundesignerName);


}
