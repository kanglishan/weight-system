package com.weight.system.data;

import com.alibaba.fastjson.JSONObject;

/**
 * @author didi
 * @since 2018/10/14
 */
public class CxpResponse<T> {

    private Integer errorNo;

    private String msg;

    private T data;

    public CxpResponse(){}

    public CxpResponse(Integer errorNo, String msg){
        this.errorNo = errorNo;
        this.msg = msg;
    }

    //Object不要是String类型
    public CxpResponse(T data){
        this.errorNo = 200;
        this.msg = "ok";
        this.data = data;
    }

    public Integer getErrorNo() {
        return errorNo;
    }

    public void setErrorNo(Integer errorNo) {
        this.errorNo = errorNo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toJsonStr(){
        return JSONObject.toJSONString(this);
    }
}
