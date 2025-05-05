package org.koreait.member.validators;

import org.koreait.global.execptions.BadRequestException;
import org.koreait.global.validators.RequiredFieldValidator;
import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;

public class MemberJoinValidator implements Validator<RequestJoin> , RequiredFieldValidator {
    /*
    *    회원가입 데이터 유효성 검사
    *   1. 필수항목 - 이메일, 비밀번호, 비밀번호 확인, 휴대전화 번호, 약관 동의
    *   2. 이메일 중복 여부, 회원을 인증하는 것이 이메일 이므로 중복X
    *   3. 이메일 형식 체크
    *   4. 비밀번호는 8자리 이상
    *   5. 휴대전화 번호 형식 체크
    *   @param requestJoin
    * */

    @Override
    public void check(RequestJoin form) {

        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String name = form.getName();
        String mobile = form.getMobile();
        boolean terms = form.isTerms();

        //1. 필수항목 -  null,  비어 있는 문자열 "", "   "
        if(email == null || email.isBlank()){
            throw new BadRequestException("이메일을 입력하세요");
        }
    }


}
