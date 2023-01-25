package com.likebookapp.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "posts")
public class Post extends BaseEntity {

    @Column(columnDefinition = "TEXT")
    private String content;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "moods_id")
    private Mood mood;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column
    private int likes;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<User> userLikes;


    public Post() {
    }

    public String getContent() {
        return content;
    }

    public Post setContent(String content) {
        this.content = content;
        return this;
    }

    public Mood getMood() {
        return mood;
    }

    public Post setMood(Mood mood) {
        this.mood = mood;
        return this;
    }


    public User getUser() {
        return user;
    }

    public Post setUser(User user) {
        this.user = user;
        return this;
    }

    public int getLikes() {
        return likes;
    }

    public Post setLikes(int likes) {
        this.likes = likes;
        return this;
    }

    public Set<User> getUserLikes() {
        return userLikes;
    }

    public Post setUserLikes(Set<User> userLikes) {
        this.userLikes = userLikes;
        return this;
    }
}
