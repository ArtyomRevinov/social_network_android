package com.example.socialnetwork.entity;

public class Contact {

    private String name;
    private int photo;

    public Contact() {
    }

    public Contact(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}