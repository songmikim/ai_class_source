package org.koreait.member;

import lombok.*;

//@ToString
//@Getter @Setter
//@EqualsAndHashCode
@Data
//@NoArgsConstructor      // 매개변수가 없는 기본생성자 추가
//@AllArgsConstructor     // 모든 인스턴스 변수를 생성자 매개변수로 추가해서 초기화하는 패턴
@RequiredArgsConstructor  // 필수 초기화 필요한 인스턴스 변수를 생성자 매개변수로 추가 초기화 하는 패턴
public class Member {
    private String email;
    //@ToString.Exclude   // 테스트에서 항목 배제됨
    private String password;
    @NonNull
    private String name;

}
