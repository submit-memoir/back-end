package com.min56.backend.exception;

import com.min56.backend.exception.handler.MemoirException;
import org.springframework.http.HttpStatus;

// 404 exception
public class NotFoundException extends MemoirException {

    private static final NotFoundException EXCEPTION = new NotFoundException("Not Found");


    protected NotFoundException(String message) {
        super(HttpStatus.NOT_FOUND.value(), message);
    }
}
