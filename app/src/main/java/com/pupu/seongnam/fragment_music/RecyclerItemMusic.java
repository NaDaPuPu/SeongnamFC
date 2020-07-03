package com.pupu.seongnam.fragment_music;

public class RecyclerItemMusic {
    private String titleStr;
    private String lyricsStr;

    public RecyclerItemMusic(String title, String lyrics) {
        this.titleStr = title;
        this.lyricsStr = lyrics;
    }

    public String getTitleStr() {
        return titleStr;
    }

    public void setTitleStr(String titleStr) {
        this.titleStr = titleStr;
    }

    public String getLyricsStr() {
        return lyricsStr;
    }

    public void setLyricsStr(String lyricsStr) {
        this.lyricsStr = lyricsStr;
    }
}
