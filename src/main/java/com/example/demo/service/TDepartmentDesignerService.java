package com.example.demo.service;

import com.example.demo.common.model.ResultInfo;

/**
 * Created by Administrator on 2017/8/5.
 */
public interface TDepartmentDesignerService {


    ResultInfo selectAllDesigner();


    ResultInfo selectAllDesigner(Integer designerId,String designerName);



}
