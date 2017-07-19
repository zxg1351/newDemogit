package com.example.demo.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/19.
 */
@Data
public class ResultInfo<T>{

    // 返回值Code ResultType 类型的参考
    private String resultCode;
    // 错误信息
    private String resultMessage;

    private T appData;
}
