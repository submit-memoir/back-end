package com.min56.backend.exception.handler;

import com.min56.backend.exception.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MemoirExceptionHandler {

    // @Vaild 어노테이션을 통과하지 못 했을 때
    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ErrorResponse> handleValidatorException(MethodArgumentNotValidException e) {
        return new ResponseEntity<>(
                new ErrorResponse(HttpStatus.BAD_REQUEST.value(), e.getLocalizedMessage()),
                HttpStatus.BAD_REQUEST
        );
    }
}
