package com.byx.test.bilibili.base;

/**
 * Created by bob
 * Date : 21-9-15
 * Describe :
 */
public class BaseResponse<T> {
    private int code;
    private String message;
    private int ttl;
    private T data;

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
