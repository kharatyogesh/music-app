package com.yogesh.music;

public class Song {
    String title;
    Double duration;

    public Song(String title, Double duration) {
        this.title = title;
        this.duration = duration;
    }
    public Song (){

    }

    public String getTitle() {
        return title;
    }

    public Double getDuration() {
        return duration;
    }

    // return all properties of class.
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
