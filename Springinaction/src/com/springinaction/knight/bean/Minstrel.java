package com.springinaction.knight.bean;

import java.io.PrintStream;

/**
 * @author : Julian
 * @date : 2019/2/27 16:46
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }


    /**
     * 任务开启前调用
     */
    public void singBeforeQuest() {
        stream.println("Fa la la,the knight is so brave!");
    }

    /**
     * 任务完成后调用
     */
    public void singAfterQuest() {
        stream.println("Tee hee hee,the brave knight did embark on a quest!");
    }
}
