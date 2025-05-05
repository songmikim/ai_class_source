package org.koreait.global.execptions;

public class BadRequestException extends CommonException{ // 검증실패 오류

    public BadRequestException(){
        this("잘못된 요청입니다.");
    }

    public BadRequestException(String message){
        super(message, 400);
    }
}
