package com.example.socialnetwork.entity;

public class Post {

    private String postBody;
    private int photo;

    public Post() {
    }

    public Post(String postBody, int photo) {
        this.postBody = postBody;
        this.photo = photo;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
