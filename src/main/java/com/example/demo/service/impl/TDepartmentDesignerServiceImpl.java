package com.example.demo.service.impl;

import com.example.demo.bean.TDepartmentDesigner;
import com.example.demo.bean.TDepartmentDesignerExample;
import com.example.demo.common.model.ResultInfo;
import com.example.demo.mapper.TDepartmentDesignerMapper;
import com.example.demo.service.TDepartmentDesignerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/8/5.
 */
public class TDepartmentDesignerServiceImpl implements TDepartmentDesignerService
{

    @Autowired
    private TDepartmentDesignerMapper tDepartmentDesignerMapper;

    @Override
    public ResultInfo selectAllDesigner() {

        TDepartmentDesignerExample tDepartmentDesignerExample = new TDepartmentDesignerExample();
        tDepartmentDesignerExample.createCriteria();

        List<TDepartmentDesigner> tDepartmentDesignerList = tDepartmentDesignerMapper.selectByExample(tDepartmentDesignerExample);


        if (Collections.)


        return null;
    }

    @Override
    public ResultInfo selectAllDesigner(Integer designerId, String designerName) {
        return null;
    }
}
