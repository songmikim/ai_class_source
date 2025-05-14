package org.koreait.configs;

import org.koreait.member.dao.MemberDao;
import org.koreait.member.services.JoinService;
import org.koreait.member.services.LoginService;
import org.koreait.member.validators.JoinValidator;
import org.koreait.member.validators.LoginValidator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import java.time.format.DateTimeFormatter;

@Configuration
//@Import(DBConfig.class)
//@ComponentScans({"org.koreait.member", "org.koreait.configs"})
//@ComponentScan("org.koreait")

/*@ComponentScan(basePackages = "org.koreait", excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, Classes = ManualBean.class))*/

/*@ComponentScan(basePackages = "org.koreait",
    excludeFilters = @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, classes = MemberDao.class))*/

/*@ComponentScan(basePackages = "org.koreait", excludeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "org.koreait.member.dao.*Dao"))*/

/*@ComponentScan(basePackages = "org.koreait", excludeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "org.koreait..*Dao"))*/

/*@ComponentScan(basePackages = "org.koreait", excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.koreait.member\\..*Dao"))*/

@ComponentScan("org.koreait")
public class AppCtx2 {
    //@Bean
    public DateTimeFormatter dateTimeFormatter(){
        return DateTimeFormatter.ofPattern("yy.MM.dd HH:mm");
    }

   /* @Bean
    @Qualifier("dtf2")
    public DateTimeFormatter dateTimeFormatter2(){
        return DateTimeFormatter.ofPattern("yy.MM.dd");
    }*/
}
