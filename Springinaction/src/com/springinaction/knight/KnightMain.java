package com.springinaction.knight;

import com.springinaction.knight.interfaces.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Julian
 * @date : 2019/2/27 15:52
 */
public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/knight/springconfig.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
