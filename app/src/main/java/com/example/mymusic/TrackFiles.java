package com.example.mymusic;

public class TrackFiles {
    private String title;
    private String singer;
    private String thumbnail;

    public TrackFiles(String title, String singer, String thumbnail) {
        this.title = title;
        this.singer = singer;
        this.thumbnail = thumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
