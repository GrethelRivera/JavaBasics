package com.rivera.objectfactory.songfactory;

public class Song {
//Fields: title (String), artist (String), genre (String), seconds (int)
    //Step 1: listed filed declared (private)
    //Step 2: constructors
    //Step 3: setters, getters, toString()

    private String title;
    private String artist;
    private String genre;
    private int seconds;

    public Song(String title, String artist, String genre, int seconds) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.seconds = seconds;
    }

    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String artist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String genre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int seconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Song{");
        sb.append("title='").append(title).append('\'');
        sb.append(", artist='").append(artist).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", seconds=").append(seconds);
        sb.append('}');
        return sb.toString();
    }
}
