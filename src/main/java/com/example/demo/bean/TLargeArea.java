package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class TLargeArea implements Serializable {
    private Integer id;

    private String largeAreaName;

    private Integer largeAreaId;

    private Date createTime;

    private Integer createUser;

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

    public String getLargeAreaName() {
        return largeAreaName;
    }

    public void setLargeAreaName(String largeAreaName) {
        this.largeAreaName = largeAreaName == null ? null : largeAreaName.trim();
    }

    public Integer getLargeAreaId() {
        return largeAreaId;
    }

    public void setLargeAreaId(Integer largeAreaId) {
        this.largeAreaId = largeAreaId;
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
}