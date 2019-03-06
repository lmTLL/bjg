package com.imtll.bjg.common.vo;

/**
 * Create with IDEA
 *
 * @ClassName ResultVo
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/5 15:28
 * @Version 1.0
 */
public class ResultVo {
    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
