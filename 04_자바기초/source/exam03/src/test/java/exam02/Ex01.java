package exam02;

import global.configs.DBConn;
import member.mappers.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ex01 {
    private  DBConn conn;

    @BeforeEach
    void init(){
        conn = DBConn.getInstance();
    }

    @Test
    void test1(){
        SqlSession session = conn.getSession();
        System.out.println(session);
    }

    @Test
    void test2(){
        SqlSession session = conn.getSession();
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        //int total = mapper.getTotal();
        //System.out.println(total);
        //Member member = mapper.getMember("user01@test.org");
        //System.out.println(member);

        //int affectedRows = mapper.register("user02@test.org","123456", "사용자2", "01012345679");
        //System.out.println(affectedRows);

        //Optional<Member> opt = mapper.getMember("user01@test.org");
        //System.out.println(opt.get());
    }
}
