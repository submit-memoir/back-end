package com.min56.backend.exception.handler;

import lombok.Getter;

@Getter //필드 값을 가져오기 위해서
public class MemoirException extends RuntimeException {

    private final int status;
    private final String message;

    protected MemoirException(int status, String message) { //이 생성자는 상속받은 클래스에서만 호출가능
        this.status = status;
        this.message = message;
    }

}
