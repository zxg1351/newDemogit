package com.example.demo.service;

import com.example.demo.common.model.ResultInfo;

/**
 * Created by Administrator on 2017/7/31.
 */
public interface VericodeService {

    public ResultInfo insertVercode(String verCode,String telephone);
}
