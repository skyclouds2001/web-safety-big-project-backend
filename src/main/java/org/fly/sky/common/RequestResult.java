package org.fly.sky.common;

public class RequestResult {

    private static final RequestCode UNKNOWN = RequestCode.UNKNOWN;

    private static final RequestCode SUCCESS = RequestCode.SUCCESS;

    private static final RequestCode FAILURE = RequestCode.FAILURE;

    private boolean success;

    private int code;

    private String message;

    private Object data;

    public RequestResult() {
        this(null);
    }

    public RequestResult(Object data) {
        this(UNKNOWN.getCode(), UNKNOWN.getMessage(), data);
    }

    public RequestResult(int code, String message, Object data) {
        this(code == SUCCESS.getCode(), code, message, data);
    }

    public RequestResult(RequestCode requestCode, Object data) {
        this(requestCode.getCode(), requestCode.getMessage(), data);
    }

    public RequestResult(boolean success, int code, String message, Object data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static RequestResult create() {
        RequestResult result = new RequestResult();
        result.setSuccess(UNKNOWN.isSuccess());
        result.setCode(UNKNOWN.getCode());
        result.setMessage(UNKNOWN.getMessage());
        result.setData(null);
        return result;
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
        return "RequestResult{" +
                "success=" + success +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public RequestResult ok() {
        this.setSuccess(SUCCESS.isSuccess());
        return this;
    }

    public RequestResult fail() {
        this.setSuccess(FAILURE.isSuccess());
        return this;
    }

    public RequestResult success(boolean success) {
        this.setSuccess(success);
        return this;
    }

    public RequestResult code(Integer code){
        this.setCode(code);
        return this;
    }

    public RequestResult message(String message){
        this.setMessage(message);
        return this;
    }

    public RequestResult data(Object data) {
        this.setData(data);
        return this;
    }

}
