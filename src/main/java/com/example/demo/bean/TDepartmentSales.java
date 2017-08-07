package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class TDepartmentSales implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_sales.id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_sales.sale_name
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private String saleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_sales.sale_type
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private String saleType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_sales.create_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_sales.create_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_sales.update_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_sales.update_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_sales.del_flag
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private String delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_sales.m_user_id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer mUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_department_sales
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_sales.id
     *
     * @return the value of t_department_sales.id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_sales.id
     *
     * @param id the value for t_department_sales.id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_sales.sale_name
     *
     * @return the value of t_department_sales.sale_name
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public String getSaleName() {
        return saleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_sales.sale_name
     *
     * @param saleName the value for t_department_sales.sale_name
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setSaleName(String saleName) {
        this.saleName = saleName == null ? null : saleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_sales.sale_type
     *
     * @return the value of t_department_sales.sale_type
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public String getSaleType() {
        return saleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_sales.sale_type
     *
     * @param saleType the value for t_department_sales.sale_type
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setSaleType(String saleType) {
        this.saleType = saleType == null ? null : saleType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_sales.create_time
     *
     * @return the value of t_department_sales.create_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_sales.create_time
     *
     * @param createTime the value for t_department_sales.create_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_sales.create_user
     *
     * @return the value of t_department_sales.create_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_sales.create_user
     *
     * @param createUser the value for t_department_sales.create_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_sales.update_time
     *
     * @return the value of t_department_sales.update_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_sales.update_time
     *
     * @param updateTime the value for t_department_sales.update_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_sales.update_user
     *
     * @return the value of t_department_sales.update_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_sales.update_user
     *
     * @param updateUser the value for t_department_sales.update_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_sales.del_flag
     *
     * @return the value of t_department_sales.del_flag
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_sales.del_flag
     *
     * @param delFlag the value for t_department_sales.del_flag
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_sales.m_user_id
     *
     * @return the value of t_department_sales.m_user_id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getmUserId() {
        return mUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_sales.m_user_id
     *
     * @param mUserId the value for t_department_sales.m_user_id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setmUserId(Integer mUserId) {
        this.mUserId = mUserId;
    }
}