package com.example.spotifyplaylistapp.repository;
import com.example.spotifyplaylistapp.model.entity.Song;
import com.example.spotifyplaylistapp.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u.playlist from User as u where u.id=:userid")
    List<Song> getPlaylistOnUser(@Param("userid") Long userid);

    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);


}
