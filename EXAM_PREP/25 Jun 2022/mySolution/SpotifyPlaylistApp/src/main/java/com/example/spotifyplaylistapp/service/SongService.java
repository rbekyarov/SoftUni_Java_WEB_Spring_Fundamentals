package com.example.spotifyplaylistapp.service;

import com.example.spotifyplaylistapp.model.entity.Song;

import java.util.List;

public interface SongService {
    List<Song> getSongsPop();

    List<Song> getsongsRock();

    List<Song> getsongsJazz();


    boolean findSongByPerformer(String value);
}
