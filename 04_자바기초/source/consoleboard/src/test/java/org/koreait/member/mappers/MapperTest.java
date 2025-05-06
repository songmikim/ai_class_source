package org.koreait.member.mappers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.global.configs.DBConn;

public class MapperTest {
    private MemberMapper mapper;

    @BeforeEach
    void init(){
        mapper = DBConn.getInstance().getSession().getMapper(MemberMapper.class);
    }

    @Test
    void test1(){
/*        Member member = new Member();
        member.setEmail("user01@test.org");
        member.setPassword("1234");
        member.setName("사용자01");
        member.setTerms(true);
        member.setMobile("01012345678");

        int affectedRows = mapper.register(member);
        System.out.println(affectedRows);*/    // insert


        /*Member member = new Member();
        member.setEmail("user01@test.org");
        member.setName("(수정)사용자01");
        mapper.update(member);  */            // 수정
        
        /*
        Member member = mapper.get("user01@test.org").orElse(null);
        System.out.println(member);   // 한명 조회
          */

        mapper.delete("user01@test.org");

        //List<Member> members = mapper.getList();
        //members.forEach(System.out::println);    // 전체 조회
    }
}
