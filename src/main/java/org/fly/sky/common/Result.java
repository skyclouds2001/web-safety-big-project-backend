package org.fly.sky.common;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public class Result {

    private static final Code UNKNOWN = Code.UNKNOWN;

    private static final Code SUCCESS = Code.SUCCESS;

    private static final Code FAILURE = Code.FAILURE;

    private boolean success;

    private int code;

    private String message;

    private Object data;

    private Result() {
        this(UNKNOWN);
    }

    public Result(Code code) {
        this(code, null);
    }

    public Result(Code code, Object data) {
        this(code.getCode(), code.getMessage(), data);
    }

    public Result(int code, String message, Object data) {
        this(code == SUCCESS.getCode(), code, message, data);
    }

    public Result(boolean success, int code, String message, Object data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public static Result createResult() {
        return createResult(UNKNOWN);
    }

    public static Result createResult(Code code) {
        return createResult(code, null);
    }

    public static Result createResult(Code code, Object data) {
        Result result = new Result();
        result.setSuccess(code.isSuccess());
        result.setCode(code.getCode());
        result.setMessage(code.getMessage());
        result.setData(data);
        return result;
    }

    public Result ok() {
        this.setSuccess(SUCCESS.isSuccess());
        return this;
    }

    public Result fail() {
        this.setSuccess(FAILURE.isSuccess());
        return this;
    }

    public Result success(boolean success) {
        this.setSuccess(success);
        return this;
    }

    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    public Result data(Object data) {
        this.setData(data);
        return this;
    }

}
