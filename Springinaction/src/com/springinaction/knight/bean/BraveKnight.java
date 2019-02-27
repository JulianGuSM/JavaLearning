package com.springinaction.knight.bean;

import com.springinaction.knight.interfaces.Knight;
import com.springinaction.knight.interfaces.Quest;

/**
 * @author : Julian
 * @date : 2019/2/27 15:59
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
