package com.example.demo.service.impl;

import com.example.demo.bean.TDepartmentDesigner;
import com.example.demo.bean.TDepartmentDesignerExample;
import com.example.demo.common.model.ResultInfo;
import com.example.demo.mapper.TDepartmentDesignerMapper;
import com.example.demo.service.TDepartmentDesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

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


        ResultInfo resultInfo = new ResultInfo();
        TDepartmentDesigner tDepartmentDesigner = new TDepartmentDesigner();

        TDepartmentDesignerExample tDepartmentDesignerExample = new TDepartmentDesignerExample();
        tDepartmentDesignerExample.createCriteria();

        List<TDepartmentDesigner> tDepartmentDesignerList = tDepartmentDesignerMapper.selectByExample(tDepartmentDesignerExample);


        if (!CollectionUtils.isEmpty(tDepartmentDesignerList)){
           resultInfo.setResultMessage("查询成功");
           resultInfo.setResultCode("0");
           resultInfo.setAppData(tDepartmentDesignerList);
        }else {

            resultInfo.setResultMessage("查询失败");
            resultInfo.setResultCode("1");

        }


        return resultInfo;
    }



    /**
     *
     * @param designerId
     * @param designerName
     * @return
     */
    @Override
    public ResultInfo selectDesigner(Integer designerId, String designerName) {

        ResultInfo resultInfo = new ResultInfo();
        TDepartmentDesigner tDepartmentDesigner = new TDepartmentDesigner();

        TDepartmentDesignerExample tDepartmentDesignerExample = new TDepartmentDesignerExample();
        tDepartmentDesignerExample.createCriteria().andMUserIdEqualTo(designerId).andNameEqualTo(designerName);
        List<TDepartmentDesigner> tDepartmentDesignerList = tDepartmentDesignerMapper.selectByExample(tDepartmentDesignerExample);
        if (!CollectionUtils.isEmpty(tDepartmentDesignerList)){
            resultInfo.setResultMessage("查询成功");
            resultInfo.setResultCode("0");
            resultInfo.setAppData(tDepartmentDesignerList);
        }else {
            resultInfo.setResultMessage("查询失败");
            resultInfo.setResultCode("1");
        }
        return resultInfo;
    }
}
