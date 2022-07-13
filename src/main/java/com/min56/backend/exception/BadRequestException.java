package com.min56.backend.exception;

import com.min56.backend.exception.handler.MemoirException;
import org.springframework.http.HttpStatus;

//400 exception
public class BadRequestException extends MemoirException {

    public static final BadRequestException EXCEPTION = new BadRequestException("Bad Request");
    /*
    static final 변수를 만든 이유 : 매번 throw 'new'로 새로운 exceptioin 객체를 만들게 되면 자원 낭비가 있을 수 있음
    static final은 한 번 만들어서 계속 돌려서 사용하기 때문에 속도/메모리 향상
     */

    private BadRequestException(String message) {
        super(HttpStatus.BAD_REQUEST.value(), message);
    }
}
