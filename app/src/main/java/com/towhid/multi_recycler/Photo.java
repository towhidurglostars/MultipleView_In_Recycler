package com.towhid.multi_recycler;

public class Photo {
    private String photoUrl;
    private String title;

    public Photo(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Photo(String photoUrl, String title) {
        this.photoUrl = photoUrl;
        this.title = title;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
