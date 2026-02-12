package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private  Integer likes;
    private Date creationDat;
    private Long id;
    public Post(Long id, String text, Date creationDat){

        this.text = text;
        this.id = id;
        this.likes = 0;
        this.creationDat = creationDat;
    }

    public Integer getLikes() {
        return likes;
    }
    public String getText(){
        return text;
    }
    public Date getCreationDat() {
        return creationDat;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
