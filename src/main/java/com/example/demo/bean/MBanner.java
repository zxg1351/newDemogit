package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class MBanner implements Serializable {
    private Integer id;

    private String mBannerName;

    private String mBannerUrl;

    private String mBannerType;

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

    public String getmBannerName() {
        return mBannerName;
    }

    public void setmBannerName(String mBannerName) {
        this.mBannerName = mBannerName == null ? null : mBannerName.trim();
    }

    public String getmBannerUrl() {
        return mBannerUrl;
    }

    public void setmBannerUrl(String mBannerUrl) {
        this.mBannerUrl = mBannerUrl == null ? null : mBannerUrl.trim();
    }

    public String getmBannerType() {
        return mBannerType;
    }

    public void setmBannerType(String mBannerType) {
        this.mBannerType = mBannerType == null ? null : mBannerType.trim();
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