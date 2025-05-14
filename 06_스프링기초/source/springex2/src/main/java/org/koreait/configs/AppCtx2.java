package org.koreait.configs;

import org.koreait.proxy.Calculator;
import org.koreait.proxy.RecCalculator;
import org.koreait.proxy3.Performance3Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppCtx2 {

    @Bean
    public Performance3Calculator performance3Calculator(){
        return new Performance3Calculator();
    }
    @Bean
    public Calculator reCalculator(){
        return new RecCalculator();
    }
}
