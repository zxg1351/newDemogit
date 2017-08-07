package com.example.demo.mapper;

import com.example.demo.bean.MVercode;
import com.example.demo.bean.MVercodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MVercodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_vercode
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int countByExample(MVercodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_vercode
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int deleteByExample(MVercodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_vercode
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int insert(MVercode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_vercode
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int insertSelective(MVercode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_vercode
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    List<MVercode> selectByExample(MVercodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_vercode
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int updateByExampleSelective(@Param("record") MVercode record, @Param("example") MVercodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_vercode
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int updateByExample(@Param("record") MVercode record, @Param("example") MVercodeExample example);
}