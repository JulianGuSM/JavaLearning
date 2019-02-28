package com.springinaction.soundsystem.config;

import com.springinaction.soundsystem.component.CDPlayer;
import com.springinaction.soundsystem.component.SgtPeppers;
import com.springinaction.soundsystem.interfaces.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * The type Cd player config.
 * CDPlayerConfig通过JAVA代码定义了Spring的装配规则。
 * 使用了@ComponentScan注解，开启了组件扫描
 * 如果没有其他配置的话，@ComponentScan默认会扫描与配置类相同的包
 * 因为CDPlayConfig类位于soundsystem.config包中，因此Spring会扫描这个包以及子包
 * 查找带有@Component注解的类，自动为其创建一个bean
 * <p>
 * 为了能够扫描其他包，需要在@ComponentScan的value属性中指明包名称
 * <p>
 * 除了将包设置为简单的String类型外，@ComponentScan还提供了另一种方法
 * 就是将其指定为包中所包含的类或接口
 *
 * @author : Julian
 * @date : 2019/2/28 9:59
 */
@Configuration
@ComponentScan(basePackages = "com.springinaction.soundsystem")
/**
 * 指定为包中所包含的类或接口
 * @ComponentScan(basePackageClasses = {CDPlayer.class，DVDPlayer.class})
 */
public class CDPlayerConfig {
    /**
     * @Eean 注解会告诉Spring这个方法将会返回一个对象
     * 该对象要注册为Spring应用上下文的bean
     *
     * 默认情况下，bean的id与带有@Bean注解的方法名一样
     * 本例中，bean的id就是sgtPeppers
     * 如果要重设id，可以通过name属性指定一个不同的名字
     * 例如 @Bean(name = "lonelyHeartsClubBand")
     * @return the compact disc
     */
    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    /*@Bean
    public CompactDisc randomBeatlesCD() {
        int choice = (int) Math.floor(Math.random() * 4);
        if (choice == 0) {
            return new SgtPeppers();
        } else if (choice == 1) {
            return new WhiteAlum();
        } else if (choice == 2) {
            return new HardDaysNigtht();
        } else {
            return new Revolver();
        }
    }*/

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }
}
