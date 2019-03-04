package com.springinaction.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author : Julian
 * @date : 2019/3/1 10:52
 */
@Aspect
public class AudienceAround {
    @Pointcut("execution(* *.interfaces.Performance.perform(..))")
    public void performance() { }

    /**
     * Watch performance.
     * 注解@Around表明watchPerformance()方法会作为performance()切点的环绕通知
     * 接受ProceedingJoinPoint作为参数
     * 这个对象是必须要有的，因为你要在通知中通过它来调用被通知的方法
     * 通知方法中可以做任何事情，当要将控制权交给被通知的方法时，它调用
     * ProceedingJoinPoint的proceed()方法，千万别忘了调用该方法
     * @param joinPoint the join point
     */
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            joinPoint.proceed();
            System.out.println("Clap clap clap...");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }
    }
}
