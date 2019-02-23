package com.my.blog.website.Soundsystem;

import java.util.Comparator;
import java.util.List;

public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("playing" +title +"by" +artist);
        for (String track:tracks){
            System.out.println("-Track"+track);
        }
    }
    public  void  playTrack(int trackNumber){
        System.out.println("playing " +tracks.get(trackNumber));
    }

}
