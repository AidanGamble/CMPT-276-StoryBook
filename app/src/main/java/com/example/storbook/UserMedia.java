package com.example.storbook;

public class UserMedia {
    String title, filename;
    Integer timeclicked = 0;

    public String getTitle() {return title; }

    public String getFilename() {return filename; }

    public Integer getTimeClicked() {return timeclicked; }

    public UserMedia(String title, String filename, Integer timeclicked) {
        this.title = title;
        this.filename = filename;
        this.timeclicked = timeclicked;
    }
}
