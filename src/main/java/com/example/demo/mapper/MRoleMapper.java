package com.example.demo.mapper;

import com.example.demo.bean.MRole;
import com.example.demo.bean.MRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_role
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    int countByExample(MRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_role
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    int deleteByExample(MRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_role
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    int insert(MRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_role
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    int insertSelective(MRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_role
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    List<MRole> selectByExample(MRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_role
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    int updateByExampleSelective(@Param("record") MRole record, @Param("example") MRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_role
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    int updateByExample(@Param("record") MRole record, @Param("example") MRoleExample example);
}