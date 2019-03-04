package com.springinaction.concert;

import org.aspectj.lang.annotation.*;

/**
 * The type Audience.
 *
 * @author : Julian
 * @date : 2019/3/1 10:18
 */
@Aspect
public class Audience {
    /**
     * Performance.
     * 定义命名的切点
     */
    @Pointcut("execution(* *.perform(..))")
    public void performance(){ }

    /**
     * Silence cell phones.
     * 表演开始之前
     */
    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    /**
     * Take seats.
     * 表演开始之前
     */
    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    /**
     * Applause.
     * 表演之后
     */
    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP...");
    }

    /**
     * Demand refund.
     * 表演失败之后
     */
    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund!");
    }
}
