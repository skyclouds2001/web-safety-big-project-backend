package org.fly.sky.exception;

import org.fly.sky.common.Code;

public class CustomException extends RuntimeException {

    private final Code code;

    public CustomException(Code code) {
        this.code = code;
    }

    public CustomException(String message, Code code) {
        super(message);
        this.code = code;
    }

    public CustomException(String message, Throwable cause, Code code) {
        super(message, cause);
        this.code = code;
    }

    public CustomException(Throwable cause, Code code) {
        super(cause);
        this.code = code;
    }

    public Code getCode() {
        return code;
    }

}
