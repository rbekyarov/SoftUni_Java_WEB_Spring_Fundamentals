package com.example.spotifyplaylistapp.model.entity;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table
public class Style extends BaseEntity{

    private Styles styleName;


    private String description;


    private Set<Song> songs;

    public Style() {
    }

    public Style(Styles styleName, String description) {
        this.styleName = styleName;
        this.description = description;
    }
    @Column(nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    public Styles getStyleName() {
        return styleName;
    }

    public void setStyleName(Styles styleName) {
        this.styleName = styleName;
    }
    @Column
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @OneToMany(mappedBy = "style", fetch = FetchType.LAZY)
    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }
}
