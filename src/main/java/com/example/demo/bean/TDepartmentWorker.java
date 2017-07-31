package com.example.demo.bean;

import java.io.Serializable;

public class TDepartmentWorker implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_worker.id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_worker.t_work_name
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String tWorkName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_worker.t_work_tel
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String tWorkTel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_worker.t_work_type
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String tWorkType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_worker.create_time
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_worker.create_user
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_worker.update_user
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_worker.update_time
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_worker.del_flag
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_worker.manager_Id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String managerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_department_worker.t_work_address
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String tWorkAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_department_worker
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_worker.id
     *
     * @return the value of t_department_worker.id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_worker.id
     *
     * @param id the value for t_department_worker.id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_worker.t_work_name
     *
     * @return the value of t_department_worker.t_work_name
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String gettWorkName() {
        return tWorkName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_worker.t_work_name
     *
     * @param tWorkName the value for t_department_worker.t_work_name
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void settWorkName(String tWorkName) {
        this.tWorkName = tWorkName == null ? null : tWorkName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_worker.t_work_tel
     *
     * @return the value of t_department_worker.t_work_tel
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String gettWorkTel() {
        return tWorkTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_worker.t_work_tel
     *
     * @param tWorkTel the value for t_department_worker.t_work_tel
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void settWorkTel(String tWorkTel) {
        this.tWorkTel = tWorkTel == null ? null : tWorkTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_worker.t_work_type
     *
     * @return the value of t_department_worker.t_work_type
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String gettWorkType() {
        return tWorkType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_worker.t_work_type
     *
     * @param tWorkType the value for t_department_worker.t_work_type
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void settWorkType(String tWorkType) {
        this.tWorkType = tWorkType == null ? null : tWorkType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_worker.create_time
     *
     * @return the value of t_department_worker.create_time
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_worker.create_time
     *
     * @param createTime the value for t_department_worker.create_time
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_worker.create_user
     *
     * @return the value of t_department_worker.create_user
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_worker.create_user
     *
     * @param createUser the value for t_department_worker.create_user
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_worker.update_user
     *
     * @return the value of t_department_worker.update_user
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_worker.update_user
     *
     * @param updateUser the value for t_department_worker.update_user
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_worker.update_time
     *
     * @return the value of t_department_worker.update_time
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_worker.update_time
     *
     * @param updateTime the value for t_department_worker.update_time
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_worker.del_flag
     *
     * @return the value of t_department_worker.del_flag
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_worker.del_flag
     *
     * @param delFlag the value for t_department_worker.del_flag
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_worker.manager_Id
     *
     * @return the value of t_department_worker.manager_Id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_worker.manager_Id
     *
     * @param managerId the value for t_department_worker.manager_Id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setManagerId(String managerId) {
        this.managerId = managerId == null ? null : managerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_department_worker.t_work_address
     *
     * @return the value of t_department_worker.t_work_address
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String gettWorkAddress() {
        return tWorkAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_department_worker.t_work_address
     *
     * @param tWorkAddress the value for t_department_worker.t_work_address
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void settWorkAddress(String tWorkAddress) {
        this.tWorkAddress = tWorkAddress == null ? null : tWorkAddress.trim();
    }
}