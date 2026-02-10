package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private  Integer likes;
    private Date creationDat;
    public Post(String text, Date creationDat){

        this.text = text;
        this.likes = 0;
        this.creationDat = creationDat;
    }

    public Integer getLikes() {
        return likes;
    }
    public String getText(){
        return text;
    }
    public Date getCreationDate() {  // правильное имя метода
        return creationDat;
    }
}
