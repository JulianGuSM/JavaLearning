package com.springinaction.concert.interfaces;

/**
 * The interface Performance.
 * Performance可以代表任何类型的现场表演，如舞台剧，电影或者音乐会
 * 假设我们想编写Performance的perform()方法触发通知
 * @author : Julian
 * @date : 2019/3/1 10:02
 */
public interface Performance {
    /**
     * Perform.
     */
    void perform();
}
