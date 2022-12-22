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
    EMPTY_STRING_PARAM(10003, "字符串类参数不能为空"),
    INCORRECT_INDEX_PARAM(10001, "索引参数必须为正整数"),
    FAIL_INSERT_SQL_OPERATE(20000, "数据库写入失败"),
    FAIL_SELECT_SQL_OPERATE(20001, "数据库读取失败"),
    FAIL_UPDATE_SQL_OPERATE(20002, "数据库更新失败"),
    FAIL_DELETE_SQL_OPERATE(20003, "数据库移除失败"),
    MISSING_DATA_IN_DATABASE(20004, "数据库不存在对应数据");

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
