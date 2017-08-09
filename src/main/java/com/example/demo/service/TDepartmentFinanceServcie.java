package com.example.demo.service;

import com.example.demo.common.model.ResultInfo;

/**
 * Created by Administrator on 2017/8/8.
 */
public interface TDepartmentFinanceServcie {


    ResultInfo selectAllTDepartmentFinance();

    ResultInfo selectTDepartmentFinanceByName(Integer finance,String financeName);



}
