package com.my.blog.website.Soundsystem.Config;

import com.my.blog.website.Soundsystem.BlankDisc;
import com.my.blog.website.Soundsystem.CompactDisc;
import com.my.blog.website.Soundsystem.TrackCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCountConfig {
    @Bean
    public CompactDisc sgtPeppers(){
        List<String> tracks=new ArrayList<String>();
        tracks.add("sgt. pepper's longly hearts club band");
        tracks.add("breath");
        tracks.add("hehehhe");
        tracks.add("yanhuo");
        BlankDisc cd =new BlankDisc("sgt. pepper's longly hearts club band","the Beatles",tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
