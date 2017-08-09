package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class TDepartmentWorker implements Serializable {
    private Integer id;

    private String tWorkName;

    private String tWorkTel;

    private String tWorkType;

    private Date createTime;

    private Integer createUser;

    private Integer updateUser;

    private Date updateTime;

    private String delFlag;

    private Integer managerId;

    private String tWorkAddress;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettWorkName() {
        return tWorkName;
    }

    public void settWorkName(String tWorkName) {
        this.tWorkName = tWorkName == null ? null : tWorkName.trim();
    }

    public String gettWorkTel() {
        return tWorkTel;
    }

    public void settWorkTel(String tWorkTel) {
        this.tWorkTel = tWorkTel == null ? null : tWorkTel.trim();
    }

    public String gettWorkType() {
        return tWorkType;
    }

    public void settWorkType(String tWorkType) {
        this.tWorkType = tWorkType == null ? null : tWorkType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String gettWorkAddress() {
        return tWorkAddress;
    }

    public void settWorkAddress(String tWorkAddress) {
        this.tWorkAddress = tWorkAddress == null ? null : tWorkAddress.trim();
    }
}