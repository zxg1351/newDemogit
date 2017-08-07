package com.example.demo.mapper;

import com.example.demo.bean.MUserRole;
import com.example.demo.bean.MUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_user_role
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int countByExample(MUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_user_role
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int deleteByExample(MUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_user_role
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int insert(MUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_user_role
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int insertSelective(MUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_user_role
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    List<MUserRole> selectByExample(MUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_user_role
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int updateByExampleSelective(@Param("record") MUserRole record, @Param("example") MUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_user_role
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int updateByExample(@Param("record") MUserRole record, @Param("example") MUserRoleExample example);
}