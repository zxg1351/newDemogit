package com.example.demo.mapper;

import com.example.demo.bean.TDepartmentFinance;
import com.example.demo.bean.TDepartmentFinanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDepartmentFinanceMapper {
    long countByExample(TDepartmentFinanceExample example);

    int deleteByExample(TDepartmentFinanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDepartmentFinance record);

    int insertSelective(TDepartmentFinance record);

    List<TDepartmentFinance> selectByExample(TDepartmentFinanceExample example);

    TDepartmentFinance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDepartmentFinance record, @Param("example") TDepartmentFinanceExample example);

    int updateByExample(@Param("record") TDepartmentFinance record, @Param("example") TDepartmentFinanceExample example);

    int updateByPrimaryKeySelective(TDepartmentFinance record);

    int updateByPrimaryKey(TDepartmentFinance record);
}