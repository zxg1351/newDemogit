package com.example.demo.service.impl;

import com.example.demo.bean.TDepartmentManager;
import com.example.demo.bean.TDepartmentManagerExample;
import com.example.demo.common.model.ResultInfo;
import com.example.demo.mapper.TDepartmentManagerMapper;
import com.example.demo.service.TDepartmentManagerServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/8/9.
 */
public class TDepartmentManagerServcieImpl implements TDepartmentManagerServcie {

    @Autowired
    private TDepartmentManagerMapper tDepartmentManagerMapper;


    @Override
    public ResultInfo selectAllTDepartmentManager() {

        ResultInfo resultInfo = new ResultInfo();

        TDepartmentManagerExample tDepartmentManagerExample = new TDepartmentManagerExample();
        tDepartmentManagerExample.createCriteria();
        List<TDepartmentManager> tDepartmentManagerList = tDepartmentManagerMapper.selectByExample(tDepartmentManagerExample);

        if (!CollectionUtils.isEmpty(tDepartmentManagerList)){
            resultInfo.setResultMessage("查询成功");
            resultInfo.setResultCode("0");
            resultInfo.setAppData(tDepartmentManagerList);
        }else {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("查询失败");
        }



        return resultInfo;
    }

    @Override
    public ResultInfo selectTDepartmentManager(Integer managerId, String managerName) {
        ResultInfo resultInfo = new ResultInfo();

        TDepartmentManagerExample tDepartmentManagerExample = new TDepartmentManagerExample();
        tDepartmentManagerExample.createCriteria().andMUserIdEqualTo(managerId);
        List<TDepartmentManager> departmentManagerList = tDepartmentManagerMapper.selectByExample(tDepartmentManagerExample);

        if (!CollectionUtils.isEmpty(departmentManagerList)){
            resultInfo.setResultMessage("查询成功");
            resultInfo.setResultCode("0");
            resultInfo.setAppData(departmentManagerList);
        }else {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("查询失败");
        }
        return resultInfo;
    }
}
