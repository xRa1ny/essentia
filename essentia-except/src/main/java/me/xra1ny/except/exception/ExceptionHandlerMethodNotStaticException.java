package me.xra1ny.except.exception;

import lombok.NonNull;

import java.lang.reflect.Method;

public class ExceptionHandlerMethodNotStaticException extends RuntimeException {
    public ExceptionHandlerMethodNotStaticException(@NonNull Method method) {
        super("method %s must be static"
                .formatted(method.getName()));
    }
}
