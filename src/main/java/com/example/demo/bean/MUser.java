package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class MUser implements Serializable {
    private Integer id;

    private String mUserName;

    private String wxOpenId;

    private String wbOpenId;

    private String qqOpenId;

    private String mUserTel;

    private String mUserAccount;

    private String mUserPassword;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String delFlag;

    private String mUserImageurl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName == null ? null : mUserName.trim();
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId == null ? null : wxOpenId.trim();
    }

    public String getWbOpenId() {
        return wbOpenId;
    }

    public void setWbOpenId(String wbOpenId) {
        this.wbOpenId = wbOpenId == null ? null : wbOpenId.trim();
    }

    public String getQqOpenId() {
        return qqOpenId;
    }

    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId == null ? null : qqOpenId.trim();
    }

    public String getmUserTel() {
        return mUserTel;
    }

    public void setmUserTel(String mUserTel) {
        this.mUserTel = mUserTel == null ? null : mUserTel.trim();
    }

    public String getmUserAccount() {
        return mUserAccount;
    }

    public void setmUserAccount(String mUserAccount) {
        this.mUserAccount = mUserAccount == null ? null : mUserAccount.trim();
    }

    public String getmUserPassword() {
        return mUserPassword;
    }

    public void setmUserPassword(String mUserPassword) {
        this.mUserPassword = mUserPassword == null ? null : mUserPassword.trim();
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

    public String getmUserImageurl() {
        return mUserImageurl;
    }

    public void setmUserImageurl(String mUserImageurl) {
        this.mUserImageurl = mUserImageurl == null ? null : mUserImageurl.trim();
    }
}