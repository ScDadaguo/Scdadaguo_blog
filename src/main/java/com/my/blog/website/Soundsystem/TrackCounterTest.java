package com.my.blog.website.Soundsystem;


import com.my.blog.website.Soundsystem.Config.TrackCountConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCountConfig.class)
public class TrackCounterTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule();

    @Autowired
    private CompactDisc cd ;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter(){
        cd.playTrack(0);
        cd.playTrack(1);
        cd.playTrack(1);
        cd.playTrack(1);
        cd.playTrack(2);
        cd .playTrack(2);

        assertEquals(1,counter.getPlayCount(0));
        assertEquals(2,counter.getPlayCount(2));
        assertEquals(1,counter.getPlayCount(3));
    }
}
