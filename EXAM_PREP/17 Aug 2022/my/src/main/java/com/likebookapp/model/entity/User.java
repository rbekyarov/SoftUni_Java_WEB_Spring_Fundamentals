package com.likebookapp.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class User extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "user")
    private Set<Post> posts;

    @ManyToMany(mappedBy = "userLikes",fetch = FetchType.EAGER)
    private Set<Post> likedPosts;


    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> playlist) {
        this.posts = playlist;
    }

    public void addSongToPlaylist(Post post) {
        this.posts.add(post);
    }

    public void removeSongFromPlaylist(Long songId) {
        this.posts.removeIf(s -> s.getId().equals(songId));
    }

    public void deleteAllSongFromPlaylist() {
        this.posts.clear();
    }

    public Set<Post> getLikedPosts() {
        return likedPosts;
    }

    public User setLikedPosts(Set<Post> likedPosts) {
        this.likedPosts = likedPosts;
        return this;
    }
}
