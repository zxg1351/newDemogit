package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class TDepartmentFinance implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_finance.id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_finance.name
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_finance.create_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_finance.create_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_finance.update_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_finance.update_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_finance.del_flag
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private String delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_department_finance
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_finance.id
     *
     * @return the value of t_department_finance.id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_finance.id
     *
     * @param id the value for t_department_finance.id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_finance.name
     *
     * @return the value of t_department_finance.name
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_finance.name
     *
     * @param name the value for t_department_finance.name
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_finance.create_time
     *
     * @return the value of t_department_finance.create_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_finance.create_time
     *
     * @param createTime the value for t_department_finance.create_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_finance.create_user
     *
     * @return the value of t_department_finance.create_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_finance.create_user
     *
     * @param createUser the value for t_department_finance.create_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_finance.update_time
     *
     * @return the value of t_department_finance.update_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_finance.update_time
     *
     * @param updateTime the value for t_department_finance.update_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_finance.update_user
     *
     * @return the value of t_department_finance.update_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_finance.update_user
     *
     * @param updateUser the value for t_department_finance.update_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_finance.del_flag
     *
     * @return the value of t_department_finance.del_flag
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_finance.del_flag
     *
     * @param delFlag the value for t_department_finance.del_flag
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}