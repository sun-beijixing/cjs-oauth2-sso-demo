package com.cjs.sso.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: zlt
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {

    private T datas;
    private Integer resp_code;
    private String resp_msg;

    public static <T> Result<T> succeed(String msg) {
        return new Result(null, 0, msg);
    }

    public static <T> Result<T> succeed(T model, String msg) {
        return new Result(model, 0, msg);
    }

    public static <T> Result<T> succeed(T model) {
        return new Result(model, 0, "");
    }

}
