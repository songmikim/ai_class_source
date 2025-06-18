package org.koreait.member;

import org.junit.jupiter.api.Test;

public class Ex01 {
    @Test
    void test1(){
        Member member = new Member();
        member.setEmail("user01@test.org");
        member.setName("사용자01");
        member.setPassword("123232");
        System.out.println(member);

    }

    @Test
    void test2(){
        Member member = new Member();
        member.setEmail("user01@test.org");
        member.setName("사용자01");
        member.setPassword("123232");

        Member member2 = new Member();
        member2.setEmail("user01@test.org");
        member2.setName("사용자01");
        member2.setPassword("123232");
        System.out.println(member.equals(member2));
        System.out.printf("member.hashcode():%d, member2.hashCode():%d%n", member.hashCode(),member2.hashCode());
    }

    @Test
    void test3(){
        Member member = new Member("user01@test.org", "사용자01");
        System.out.println(member);
    }
}
