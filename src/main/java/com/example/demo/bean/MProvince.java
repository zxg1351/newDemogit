package com.example.demo.bean;

import java.io.Serializable;

public class MProvince implements Serializable {
    private Integer id;

    private String provinceId;

    private String mProvinceName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    public String getmProvinceName() {
        return mProvinceName;
    }

    public void setmProvinceName(String mProvinceName) {
        this.mProvinceName = mProvinceName == null ? null : mProvinceName.trim();
    }
}