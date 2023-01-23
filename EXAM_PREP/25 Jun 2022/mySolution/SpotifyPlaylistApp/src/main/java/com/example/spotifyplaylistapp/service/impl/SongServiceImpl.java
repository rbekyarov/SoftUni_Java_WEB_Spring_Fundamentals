package com.example.spotifyplaylistapp.service.impl;

import com.example.spotifyplaylistapp.model.entity.Song;
import com.example.spotifyplaylistapp.repository.SongRepository;
import com.example.spotifyplaylistapp.service.SongService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {
    private final SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public List<Song> getSongsPop() {
        return songRepository.getSongsPop();
    }

    @Override
    public List<Song> getsongsRock() {
        return songRepository.getsongsRock();
    }

    @Override
    public List<Song> getsongsJazz() {
        return songRepository.getsongsJazz();
    }


}
