package org.fly.sky.common;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public enum Code {

    UNKNOWN(-1, "未知"),
    SUCCESS(0, "成功"),
    FAILURE(1, "失败"),
    INCORRECT_TYPE_PARAM(10000, "参数类型错误"),
    INCORRECT_RANGE_PARAM(10001, "参数范围错误"),
    MISSING_NECESSARY_PARAM(10002, "缺少的必需参数"),
    EMPTY_STRING_PARAM(10003, "字符串参数不能为空"),
    INCORRECT_INDEX_PARAM(10004, "索引参数必须为正整数"),
    FAIL_INSERT_SQL_OPERATE(20000, "数据库写入失败"),
    FAIL_SELECT_SQL_OPERATE(20001, "数据库读取失败"),
    FAIL_UPDATE_SQL_OPERATE(20002, "数据库更新失败"),
    FAIL_DELETE_SQL_OPERATE(20003, "数据库移除失败"),
    MISSING_DATA_IN_DATABASE(20004, "数据库不存在对应数据"),
    LOGIN_FAILURE(30000, "账号或密码错误"),
    DUPLICATE_PASSWORD_FAILURE(30001, "新旧密码不能相同"),
    INCORRECT_PASSWORD_FAILURE(30002, "密码错误"),
    INVALID_LENGTH_PASSWORD_FAILURE(30003, "密码长度需超过8"),
    INVALID_CHARACTER_PASSWORD_FAILURE(30004, "密码仅能由数字和大小写字母构成"),
    MISSING_CHARACTER_PASSWORD_FAILURE(30005, "密码中必须包含数字和大小写字母中的三种"),
    INVALID_EMAIL_FAILURE(30006, "邮箱格式非法"),
    INVALID_PHONE_FAILURE(30007, "电话格式非法"),
    INVALID_IDENTITY_FAILURE(30008, "身份证号码格式非法"),
    NEED_LOGIN_FAILURE(40000, "未登录");

    private boolean success;

    private int code;

    private String message;

    Code(int code, String message) {
        this.success = code == 0;
        this.code = code;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Code{" +
                "success=" + success +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

}
