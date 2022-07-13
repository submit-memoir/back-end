package com.min56.backend.exception;

import com.min56.backend.exception.handler.MemoirException;
import net.bytebuddy.asm.MemberAttributeExtension;
import org.springframework.http.HttpStatus;

// 409 exception
public class ConflictException extends MemoirException {

    public static final ConflictException EXCEPTION = new ConflictException("Conflict");

    protected ConflictException(String message) {
        super(HttpStatus.CONFLICT.value(), message);
    }
}
