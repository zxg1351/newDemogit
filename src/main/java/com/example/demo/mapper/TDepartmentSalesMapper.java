package com.example.demo.mapper;

import com.example.demo.bean.TDepartmentSales;
import com.example.demo.bean.TDepartmentSalesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDepartmentSalesMapper {
    long countByExample(TDepartmentSalesExample example);

    int deleteByExample(TDepartmentSalesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDepartmentSales record);

    int insertSelective(TDepartmentSales record);

    List<TDepartmentSales> selectByExample(TDepartmentSalesExample example);

    TDepartmentSales selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDepartmentSales record, @Param("example") TDepartmentSalesExample example);

    int updateByExample(@Param("record") TDepartmentSales record, @Param("example") TDepartmentSalesExample example);

    int updateByPrimaryKeySelective(TDepartmentSales record);

    int updateByPrimaryKey(TDepartmentSales record);
}