package org.fly.sky.common;

public enum RequestCode {

    UNKNOWN(-1, "未知"),
    SUCCESS(0, "成功"),
    FAILURE(1, "失败");

    private boolean success;

    private int code;

    private String message;

    RequestCode(int code, String message) {
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

    @Override
    public String toString() {
        return "RequestCode{" +
                "success=" + success +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

}
