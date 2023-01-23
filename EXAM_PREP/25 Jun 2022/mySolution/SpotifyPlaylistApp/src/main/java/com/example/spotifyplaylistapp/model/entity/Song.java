package com.example.spotifyplaylistapp.model.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;
@Entity
@Table(name = "songs")
public class Song extends BaseEntity{

    private String performer;

    private String title;

    private Integer duration ;
    private LocalDate releaseDate  ;

    private Style style;

    private Set<User> users;

    public Song() {
    }
    @Column(nullable = false, unique = true)
    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }
    @Column(nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Column(nullable = false)
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    @Column
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_style")
    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
    @ManyToMany(mappedBy = "playlist")
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
