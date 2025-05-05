package org.koreait.global.execptions;

import lombok.Getter;

@Getter
public class CommonException extends RuntimeException { // 공통예외
    private final int status;

    public CommonException (String message){
        this(message, 500);
    }
    public CommonException(String message, int status){
        super(message);
        this.status = status;
    }
}
