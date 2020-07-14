package com.pupu.seongnam.fragment_music;

public class Music {
    private String title, lyrics;
    private int music;

    public Music(String title, String lyrics, int music) {
        this.title = title;
        this.lyrics = lyrics;
        this.music = music;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public int getMusic() {
        return music;
    }

    public void setMusic(int music) {
        this.music = music;
    }
}
