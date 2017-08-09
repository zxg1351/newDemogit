package com.example.demo.bean;

import java.io.Serializable;

public class MArea implements Serializable {
    private Integer id;

    private String mAreaId;

    private String mAreaName;

    private Integer mCityId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmAreaId() {
        return mAreaId;
    }

    public void setmAreaId(String mAreaId) {
        this.mAreaId = mAreaId == null ? null : mAreaId.trim();
    }

    public String getmAreaName() {
        return mAreaName;
    }

    public void setmAreaName(String mAreaName) {
        this.mAreaName = mAreaName == null ? null : mAreaName.trim();
    }

    public Integer getmCityId() {
        return mCityId;
    }

    public void setmCityId(Integer mCityId) {
        this.mCityId = mCityId;
    }
}