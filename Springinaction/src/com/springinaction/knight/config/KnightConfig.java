package com.springinaction.knight.config;

import com.springinaction.knight.bean.BraveKnight;
import com.springinaction.knight.interfaces.Knight;
import com.springinaction.knight.interfaces.Quest;
import com.springinaction.knight.bean.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * config Knight Class
 * @author : Julian
 * @date : 2019/2/27 15:52
 */
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
