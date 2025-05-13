package exam01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.koreait.configs.AppCtx2;
import org.koreait.configs.DBConfig;
import org.koreait.member.RequestJoin;
import org.koreait.member.RequestLogin;
import org.koreait.member.dao.MemberDao;
import org.koreait.member.entities.Member;
import org.koreait.member.services.JoinService;
import org.koreait.member.services.LoginService;
import org.koreait.person.Greeter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Ex02 {
    private static final Log log = LogFactory.getLog(Ex02.class);

    @Test
    void test1(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);

        JoinService service = ctx.getBean("joinService", JoinService.class);
        LoginService loginService = ctx.getBean("loginService", LoginService.class);
        MemberDao memberDao = ctx.getBean("memberDao", MemberDao.class);

        RequestJoin form = new RequestJoin();
        form.setEmail("user01@test.org");
        form.setPassword("12345678");

        service.process(form);  //  회원 가입 처리

        List<Member> members = memberDao.getList();
        members.forEach(System.out::println);

        // 로그인
        RequestLogin loginForm = new RequestLogin();
        loginForm.setEmail(form.getEmail());
        loginService.process(loginForm);
        ctx.close();
    }

    @Test
    void test2(){
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class, DBConfig.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);

        JoinService service = ctx.getBean(JoinService.class);
        Greeter g1 = ctx.getBean(Greeter.class);

        System.out.println("service:" + service );
        System.out.println("g1:" + g1 );

        ctx.close();
    }
}
