package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class MRole implements Serializable {
    private Integer id;

    private String mRoleName;

    private String mRoleNumber;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String delFlag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmRoleName() {
        return mRoleName;
    }

    public void setmRoleName(String mRoleName) {
        this.mRoleName = mRoleName == null ? null : mRoleName.trim();
    }

    public String getmRoleNumber() {
        return mRoleNumber;
    }

    public void setmRoleNumber(String mRoleNumber) {
        this.mRoleNumber = mRoleNumber == null ? null : mRoleNumber.trim();
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}