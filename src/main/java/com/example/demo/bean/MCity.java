package com.example.demo.bean;

import java.io.Serializable;

public class MCity implements Serializable {
    private Integer id;

    private String mCityId;

    private String mCityName;

    private Integer mProvinceId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmCityId() {
        return mCityId;
    }

    public void setmCityId(String mCityId) {
        this.mCityId = mCityId == null ? null : mCityId.trim();
    }

    public String getmCityName() {
        return mCityName;
    }

    public void setmCityName(String mCityName) {
        this.mCityName = mCityName == null ? null : mCityName.trim();
    }

    public Integer getmProvinceId() {
        return mProvinceId;
    }

    public void setmProvinceId(Integer mProvinceId) {
        this.mProvinceId = mProvinceId;
    }
}