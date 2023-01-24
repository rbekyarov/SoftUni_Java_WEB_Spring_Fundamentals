package com.example.spotifyplaylistapp.repository;

import com.example.spotifyplaylistapp.model.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    @Query("select s from Song as s where s.style.styleName='Pop'")
    List<Song> getSongsPop();
    @Query("select s from Song as s where s.style.styleName='Rock'")
    List<Song> getsongsRock();
    @Query("select s from Song as s where s.style.styleName='Jazz'")
    List<Song> getsongsJazz();
    Optional<Song> findByPerformer(String performer);

}
