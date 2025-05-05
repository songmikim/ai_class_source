package org.koreait.global.execptions;

public class NotFoundException extends CommonException{ // 게시글이 없다. 리소스를 못찾았을때

    public NotFoundException(){
        this("데이터를 찾을 수 없습니다.");
    }

    public NotFoundException(String message){
        super(message, 404);
    }
}
