package com.springinaction.concert.config;

import com.springinaction.concert.Audience;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * The type Concert config.
 * 使用@@EnableAspectJAutoProxy开启AspectJ自动代理
 * @author : Julian
 * @date : 2019/3/1 10:43
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.springinaction.concert")
public class ConcertConfig {

    /**
     * Audience audience.
     * 声明Audience bean
     * @return the audience
     */
    @Bean
    public Audience audience() {
        return new Audience();
    }
}
