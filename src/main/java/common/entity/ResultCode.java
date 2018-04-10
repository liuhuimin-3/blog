package common.entity;


public enum ResultCode {
    SUCCESS("0","成功"),
    UnknownException("01","未知异常"),
    SystemException("02","系统异常"),
    MyException("03","业务错误"),
    InfoException("04", "提示级错误"),
    DBException("020001","数据库操作异常"),
    ParamException("040001","参数验证错误");
    private String code;
    private String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
