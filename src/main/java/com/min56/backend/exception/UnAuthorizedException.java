package com.min56.backend.exception;

import com.min56.backend.exception.handler.MemoirException;
import org.apache.catalina.valves.rewrite.Substitution;
import org.springframework.http.HttpStatus;

// 401 exception
public class UnAuthorizedException extends MemoirException {

    private static final UnAuthorizedException EXCEPTION = new UnAuthorizedException("UnAuthorized");

    protected UnAuthorizedException(String message) {
        super(HttpStatus.UNAUTHORIZED.value(), message);
    }
}
