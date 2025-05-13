package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.configs.AppCtx;
import org.koreait.person.Greeter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Ex01 {

    @Test
    void test1(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        g1.hello("안녕하세요.");

        Greeter g2 = ctx.getBean(Greeter.class);    // 싱글톤으로 이름 생략 가능
        System.out.println(g1 == g2);
        g2.hello("안녕하세요2");

        ctx.close();
    }
}
