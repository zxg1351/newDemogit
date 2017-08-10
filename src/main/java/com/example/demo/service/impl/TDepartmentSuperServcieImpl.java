package com.example.demo.service.impl;

import com.example.demo.bean.TDepartmentFundesigner;
import com.example.demo.bean.TDepartmentFundesignerExample;
import com.example.demo.bean.TDepartmentSuper;
import com.example.demo.bean.TDepartmentSuperExample;
import com.example.demo.common.model.ResultInfo;
import com.example.demo.mapper.TDepartmentSuperMapper;
import com.example.demo.service.TDepartmentSuperServcie;
import com.sun.org.apache.bcel.internal.generic.L2I;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/8/9.
 */
public class TDepartmentSuperServcieImpl implements TDepartmentSuperServcie {

    @Autowired
    private TDepartmentSuperMapper tDepartmentSuperMapper;


    @Override
    public ResultInfo selectAllTDepartmentManager() {

        ResultInfo resultInfo = new ResultInfo();
        TDepartmentSuperExample tDepartmentSuperExample = new TDepartmentSuperExample();
        tDepartmentSuperExample.createCriteria();
        List<TDepartmentSuper> tDepartmentSuperList = tDepartmentSuperMapper.selectByExample(tDepartmentSuperExample);

        if (!CollectionUtils.isEmpty(tDepartmentSuperList)) {
            resultInfo.setResultMessage("查询成功");
            resultInfo.setResultCode("0");
            resultInfo.setAppData(tDepartmentSuperList);
        } else {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("查询失败");
        }


        return resultInfo;
    }

    @Override
    public ResultInfo selectTDepartmentManager(Integer managerId, String managerName) {
        ResultInfo resultInfo = new ResultInfo();

        TDepartmentSuperExample tDepartmentSuperExample = new TDepartmentSuperExample();
        tDepartmentSuperExample.createCriteria().andIdEqualTo(managerId).andNameEqualTo(managerName);
        List<TDepartmentSuper> departmentSuperList = tDepartmentSuperMapper.selectByExample(tDepartmentSuperExample);
        if (!CollectionUtils.isEmpty(departmentSuperList)) {

            resultInfo.setResultMessage("查询成功");
            resultInfo.setResultCode("0");
            resultInfo.setAppData(departmentSuperList);

        } else {
            resultInfo.setResultCode("1");
            resultInfo.setResultMessage("查询失败");
        }
        return resultInfo;
    }
}
