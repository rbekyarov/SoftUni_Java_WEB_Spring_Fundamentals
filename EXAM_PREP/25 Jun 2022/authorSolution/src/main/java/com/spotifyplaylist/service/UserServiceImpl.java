package com.spotifyplaylist.service;

import com.spotifyplaylist.model.dto.UserDTO;
import com.spotifyplaylist.util.LoggedUser;
import com.spotifyplaylist.model.dto.RegisterDTO;
import com.spotifyplaylist.model.entity.Song;
import com.spotifyplaylist.model.entity.User;
import com.spotifyplaylist.repo.UserRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl {

    private final UserRepo repo;
    private final PasswordEncoder encoder;
    private final LoggedUser loggedUser;
    private final HttpSession session;

    public UserServiceImpl(UserRepo repo, PasswordEncoder encoder, LoggedUser loggedUser, HttpSession session) {
        this.repo = repo;
        this.encoder = encoder;
        this.loggedUser = loggedUser;
        this.session = session;
    }

    public UserDTO findUserByUsername(String username) {
        User user = this.getUserByUsername(username);
        if (user == null) {
            return null;
        }

        return this.mapUserDTO(user);
    }

    public UserDTO findUserByEmail(String email) {
        User user = repo.findByEmail(email).orElse(null);
        if (user == null) {
            return null;
        }

        return this.mapUserDTO(user);
    }

    public boolean checkCredentials(String username, String password) {
        User user = this.getUserByUsername(username);

        if (user == null) {
            return false;
        }

        return encoder.matches(password, user.getPassword());
    }

    public void login(String username) {
        User user = this.getUserByUsername(username);
        this.loggedUser.setId(user.getId());
        this.loggedUser.setUsername(user.getUsername());
    }

    public void register(RegisterDTO registerDTO) {
        this.repo.save(this.mapUser(registerDTO));
        this.login(registerDTO.getUsername());
    }

    public void logout() {
        this.session.invalidate();
        this.loggedUser.setId(null);
        this.loggedUser.setUsername(null);
    }

    public void addSongToUser(Long userId, Song song) {
        User user = this.getUSerById(userId);
        if (user.getPlaylist().stream().noneMatch(s -> s.getId().equals(song.getId()))) {
            user.addSongToPlaylist(song);
            this.repo.save(user);
        }
    }

    public void removeSongFromUser(Long userId, Long songId) {
        User user = getUSerById(userId);
        user.removeSongFromPlaylist(songId);
        this.repo.save(user);
    }

    public void deleteAllSongs(Long userId) {
        User user = getUSerById(userId);
        user.deleteAllSongFromPlaylist();
        this.repo.save(user);
    }

    private User getUSerById(Long userId) {
        return this.repo.findById(userId).orElseThrow();
    }

    private User getUserByUsername(String username) {
        return this.repo.findByUsername(username).orElse(null);
    }

    private User mapUser(RegisterDTO registerDTO) {
        User user = new User();
        user.setUsername(registerDTO.getUsername());
        user.setEmail(registerDTO.getEmail());
        user.setPassword(encoder.encode(registerDTO.getPassword()));
        return user;
    }

    private UserDTO mapUserDTO(User user) {
        return new UserDTO()
                .setId(user.getId())
                .setEmail(user.getEmail())
                .setUsername(user.getUsername());
    }
}
