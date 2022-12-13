package com.spotifyplaylist.service;

import com.spotifyplaylist.model.dto.SongDTO;
import com.spotifyplaylist.model.dto.SongsByGenreDTO;
import com.spotifyplaylist.model.entity.Song;
import com.spotifyplaylist.model.entity.Style;
import com.spotifyplaylist.model.entity.Styles;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class HomeServiceImpl {

    private final SongServiceImpl songService;
    private final StyleService styleService;
    private final UserServiceImpl userService;

    public HomeServiceImpl(SongServiceImpl songService, StyleService styleService, UserServiceImpl userService) {
        this.songService = songService;
        this.styleService = styleService;
        this.userService = userService;
    }

    public SongsByGenreDTO getSongs() {
        SongsByGenreDTO songs = new SongsByGenreDTO();
        songs.setPopSongs(this.getSongsByGenre(this.styleService.findStyleByStyleName(Styles.POP)));
        songs.setJazzSongs(this.getSongsByGenre(this.styleService.findStyleByStyleName(Styles.JAZZ)));
        songs.setRockSongs(this.getSongsByGenre(this.styleService.findStyleByStyleName(Styles.ROCK)));
        return songs;
    }

    public void addSong(Long songId, Long userId) {
        Song song = this.songService.findSongById(songId);
        this.userService.addSongToUser(userId, song);
    }

    public void removeSong(Long songId, Long userId) {
        this.userService.removeSongFromUser(userId, songId);
    }

    public void deleteAll(Long userId) {
        this.userService.deleteAllSongs(userId);
    }

    private Set<SongDTO> getSongsByGenre(Style style) {
        return this.songService.findSongsByStyle(style);
    }
}
