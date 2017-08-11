package com.example.demo.service;

import com.example.demo.common.model.ResultInfo;

/**
 * Created by Administrator on 2017/8/8.
 */
public interface TDepartmentSuperServcie {


ResultInfo selectAllTDepartmentManager();

    ResultInfo selectTDepartmentManager(Integer managerId,String managerName);
}
