package com.example.spotifyplaylistapp.service;

import com.example.spotifyplaylistapp.model.entity.Song;

import java.util.List;

public interface UserService {
    List<Song> getPlaylistOnUser(Long userid);
}
