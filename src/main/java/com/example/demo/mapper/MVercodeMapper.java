package com.example.demo.mapper;

import com.example.demo.bean.MVercode;
import com.example.demo.bean.MVercodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MVercodeMapper {
    long countByExample(MVercodeExample example);

    int deleteByExample(MVercodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MVercode record);

    int insertSelective(MVercode record);

    List<MVercode> selectByExample(MVercodeExample example);

    MVercode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MVercode record, @Param("example") MVercodeExample example);

    int updateByExample(@Param("record") MVercode record, @Param("example") MVercodeExample example);

    int updateByPrimaryKeySelective(MVercode record);

    int updateByPrimaryKey(MVercode record);
}