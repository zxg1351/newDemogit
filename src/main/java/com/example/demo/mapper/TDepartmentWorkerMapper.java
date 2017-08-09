package com.example.demo.mapper;

import com.example.demo.bean.TDepartmentWorker;
import com.example.demo.bean.TDepartmentWorkerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDepartmentWorkerMapper {
    long countByExample(TDepartmentWorkerExample example);

    int deleteByExample(TDepartmentWorkerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDepartmentWorker record);

    int insertSelective(TDepartmentWorker record);

    List<TDepartmentWorker> selectByExample(TDepartmentWorkerExample example);

    TDepartmentWorker selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDepartmentWorker record, @Param("example") TDepartmentWorkerExample example);

    int updateByExample(@Param("record") TDepartmentWorker record, @Param("example") TDepartmentWorkerExample example);

    int updateByPrimaryKeySelective(TDepartmentWorker record);

    int updateByPrimaryKey(TDepartmentWorker record);
}