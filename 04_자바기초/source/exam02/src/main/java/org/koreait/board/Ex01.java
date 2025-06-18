package org.koreait.board;

import org.junit.jupiter.api.Test;

public class Ex01 {
    @Test
    void test(){
        Board item = Board.builder()
                .seq(1L)
                .poster("작성자01")
                .subject("제목1")
                .content("내용1")
                .build();
        System.out.println(item);
    }

    void test2(){
        Board2 item = Board2.builder()
                .seq(1L)
                .poster("작성자01")
                .subject("제목1")
                .content("내용1")
                .build();
        System.out.println(item);
    }
}
