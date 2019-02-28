package com.springinaction.soundsystem.component;

import com.springinaction.soundsystem.interfaces.CompactDisc;
import com.springinaction.soundsystem.interfaces.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The type Cd player.
 * @author : Julian
 * @date : 2019/2/28 13:33
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    /**
     * Instantiates a new Cd player.
     * 该类的构造器上添加了@Autowired注解，这表明当Spring创建CDPlayerBean时，
     * 会通过这个构造器来进行实例化并且会传入一个可设置给CompactDisc类型的bean
     * CDPlayer Class 依赖于 CompactDisc Class
     * @param cd the cd
     */
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }


    /**
     * Sets cd.
     * Autowired 注解不仅能够用在构造器上，还能用在属性的
     * setter方法上进行自动装配
     * 例如    @Autowired(required = false)
     * Autowired 注解可以用在类的任何方法上
     * @param cd the cd
     */
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
