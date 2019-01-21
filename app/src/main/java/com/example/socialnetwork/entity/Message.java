package com.example.socialnetwork.entity;

public class Message {

    private String name;
    private String message;
    private int photo;

    public Message() {
    }

    public Message(String name, String message, int photo) {
        this.name = name;
        this.message = message;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public int getPhoto() {
        return photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}

