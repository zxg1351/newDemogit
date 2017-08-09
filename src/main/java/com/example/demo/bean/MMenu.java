package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class MMenu implements Serializable {
    private Integer id;

    private String mMenuNumber;

    private String mMenuName;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    private String delFlag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmMenuNumber() {
        return mMenuNumber;
    }

    public void setmMenuNumber(String mMenuNumber) {
        this.mMenuNumber = mMenuNumber == null ? null : mMenuNumber.trim();
    }

    public String getmMenuName() {
        return mMenuName;
    }

    public void setmMenuName(String mMenuName) {
        this.mMenuName = mMenuName == null ? null : mMenuName.trim();
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
}