package com.springinaction.soundsystem.component;

import com.springinaction.soundsystem.interfaces.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * The type Sgt peppers.
 * 使用了@Component注解。这个简单的注解表明该类会作为组件类
 * 并告知Spring要为这个类创建bean，没有必要显式配置SgtPeppersBean
 *
 * 不过，组件扫描默认时不启用地，我们需要显式配置Spring，从而命令
 * 它取寻找带有@Component注解地类，并为其创建Bean。
 *
 * Spring会给应用上下文中所有的bean一个ID，默认会为Class SgtPeppers给定id为sgtPepper
 * 如果要为这个bean设置不同的id，需要传值给@Component,例如@Component("lonelyHeartsClub")
 *
 * 另外一种为bean命名的方式，这种方式不使用@Component注解，而是使用java注入依赖规范（JAVA Dependency Injection）中所提供的@Named注解来为bean设置id
 *
 * import javax.inject.Named;
 *
 * `@Named("lonelyHeartsClub")
 *    public class SgtPeppers implements CompactDisc {
 *      ......
 *    }
 * Spring支持将@Named作为@Component注解的代替方案。两者之间有细微的差别但在大多数场景中可以互换
 * @author : Julian
 * @date : 2019/2/28 9:48
 */
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
