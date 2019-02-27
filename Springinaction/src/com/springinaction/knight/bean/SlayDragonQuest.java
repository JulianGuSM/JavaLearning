package com.springinaction.knight.bean;

import com.springinaction.knight.interfaces.Quest;

import java.io.PrintStream;

/**
 * @author : Julian
 * @date : 2019/2/27 16:02
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
