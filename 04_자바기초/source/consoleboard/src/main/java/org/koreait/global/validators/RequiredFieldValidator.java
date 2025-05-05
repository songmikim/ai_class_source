package org.koreait.global.validators;

public interface RequiredFieldValidator {
    default void checkString(String str, RuntimeException e){
        if(str == null || str.isBlank()){
            throw e;
        }
    }
}
