package com.springinaction.soundsystem.test;

import com.springinaction.soundsystem.config.CDPlayerConfig;
import com.springinaction.soundsystem.interfaces.CompactDisc;
import com.springinaction.soundsystem.interfaces.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * The type Cd player test.
 *
 * @author : Julian
 * @date : 2019/2/28 13:08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    /**
     * The Log.
     */
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    /**
     * Cd should not be null.
     */
    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    /**
     * 忽略intellij平台line.separator的差异
     */
    @Test
    public void play(){
        player.play();
        String expected = "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n"
                .replaceAll("\\n|\\r\\n", System.getProperty("line.separator"));
        assertEquals(expected, log.getLog());
    }
}
