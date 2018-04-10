package blog.dto;

import common.entity.ResultCode;

public class Result<T> {
    private String code= ResultCode.SUCCESS.getCode();
    private String Message=ResultCode.SUCCESS.getMessage();
    private T Data=null;

    public Result(String code, String message, T data) {
        this.code = code;
        Message = message;
        Data = data;
    }

    public Result(String code, String message) {
        this.code = code;
        Message = message;
    }

    public Result() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }
}
