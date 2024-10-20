package com.f4.fqs.springSdk.exception;

public class FQSException extends RuntimeException {

    public FQSException(String message, Throwable cause) {
        super(message, cause);
    }

    public FQSException(String message) {
        super(message);
    }

    public FQSException(Throwable cause) {
        super(cause);
    }
}
