package com.spotifyplaylist.service;

import com.spotifyplaylist.model.dto.AddSongDTO;
import com.spotifyplaylist.model.dto.SongDTO;
import com.spotifyplaylist.model.entity.Song;
import com.spotifyplaylist.model.entity.Style;
import com.spotifyplaylist.repo.SongRepo;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SongServiceImpl {

    private final SongRepo repo;
    private final StyleService styleService;

    public SongServiceImpl(SongRepo repo, StyleService styleService) {
        this.repo = repo;
        this.styleService = styleService;
    }

    public void addSong(AddSongDTO addSongDTO) {
        this.repo.save(this.mapSong(addSongDTO));
    }

    public Song findSongById(Long id) {
        return this.repo.findById(id).orElseThrow();
    }

    public SongDTO findSongByPerformer(String performer) {
        Song song = this.repo.findByPerformer(performer).orElse(null);
        if (song == null) {
            return null;
        }

        return this.mapSongDTO(song);
    }

    public Set<SongDTO> findSongsByStyle(Style style) {
        return this.repo.findByStyle(style)
                .stream()
                .map(this::mapSongDTO)
                .collect(Collectors.toSet());
    }

    public Set<SongDTO> getPlaylist(Long id) {
        return this.repo.findAllByUserId(id)
                .stream()
                .map(this::mapSongDTO)
                .collect(Collectors.toSet());
    }

    private SongDTO mapSongDTO(Song song) {
        SongDTO songDTO = new SongDTO();
        songDTO.setId(song.getId());
        songDTO.setDuration(song.getDuration());
        songDTO.setPerformer(song.getPerformer());
        songDTO.setTitle(song.getTitle());
        return songDTO;
    }

    private Song mapSong(AddSongDTO addSongDTO) {
        Song song = new Song();
        Style style = this.styleService.findStyle(addSongDTO.getStyle());

        song.setDuration(addSongDTO.getDuration());
        song.setPerformer(addSongDTO.getPerformer());
        song.setStyle(style);
        song.setTitle(addSongDTO.getTitle());
        song.setReleaseDate(addSongDTO.getReleaseDate());
        return song;
    }
}
