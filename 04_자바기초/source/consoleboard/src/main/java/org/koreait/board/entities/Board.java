package org.koreait.board.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data // Getter, Setter, toString, equals, hashCode 모두 생성
//@NoArgsConstructor  // 기본 생성자 (매개변수 없는 생성자)를 자동 생성
//@AllArgsConstructor // 생성자 자동 생성
public class Board {
    private long seq;
    private String poster;
    private String subject;
    private String content;
    private LocalDateTime regDt;
    private LocalDateTime modDt;

}
