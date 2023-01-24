package com.example.spotifyplaylistapp.service;

import com.example.spotifyplaylistapp.model.entity.Song;
import com.example.spotifyplaylistapp.model.entity.dto.RegisterDTO;

import java.util.List;

public interface UserService {
    List<Song> getPlaylistOnUser(Long userid);

    boolean checkCredentials(String username, String password);

    void login(String username);

    boolean findUserByUsername(String value);

    boolean findUserByEmail(String value);

    void register(RegisterDTO registerDTO);

    void logout();
}
