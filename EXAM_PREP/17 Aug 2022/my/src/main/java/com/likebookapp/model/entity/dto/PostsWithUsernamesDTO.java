package com.likebookapp.model.entity.dto;

import com.likebookapp.model.entity.MoodsEnum;
import com.likebookapp.model.entity.User;

import java.util.Set;

public class PostsWithUsernamesDTO {
    private String content;
    private MoodsEnum mood;
    private String username;
    private int likes;
    private Long id;
    private Set<User> userLikes;

    public PostsWithUsernamesDTO() {
    }

    public String getContent() {
        return content;
    }

    public PostsWithUsernamesDTO setContent(String content) {
        this.content = content;
        return this;
    }

    public MoodsEnum getMood() {
        return mood;
    }

    public PostsWithUsernamesDTO setMood(MoodsEnum mood) {
        this.mood = mood;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public PostsWithUsernamesDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public int getLikes() {
        return likes;
    }

    public PostsWithUsernamesDTO setLikes(int likes) {
        this.likes = likes;
        return this;
    }

    public Long getId() {
        return id;
    }

    public PostsWithUsernamesDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public Set<User> getUserLikes() {
        return userLikes;
    }

    public PostsWithUsernamesDTO setUserLikes(Set<User> userLikes) {
        this.userLikes = userLikes;
        return this;
    }

    public boolean checkIfUserIdMatchId(Long userId){
        return this.getUserLikes().stream()
                .anyMatch(user -> {
                    boolean r = user.getId().equals(userId);
                    return r;
                });
    }
}

