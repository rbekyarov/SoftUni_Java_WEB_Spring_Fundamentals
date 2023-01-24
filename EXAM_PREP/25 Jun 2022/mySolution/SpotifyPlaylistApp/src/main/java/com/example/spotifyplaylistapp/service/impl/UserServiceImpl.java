package com.example.spotifyplaylistapp.service.impl;

import com.example.spotifyplaylistapp.model.entity.Song;
import com.example.spotifyplaylistapp.model.entity.User;
import com.example.spotifyplaylistapp.model.entity.dto.RegisterDTO;
import com.example.spotifyplaylistapp.repository.UserRepository;
import com.example.spotifyplaylistapp.service.UserService;
import com.example.spotifyplaylistapp.util.LoggedUser;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder encoder;
    private final HttpSession session;
    private final LoggedUser loggedUser;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder encoder, HttpSession session, LoggedUser loggedUser) {
        this.userRepository = userRepository;
        this.encoder = encoder;
        this.session = session;
        this.loggedUser = loggedUser;
    }

    @Override
    public List<Song> getPlaylistOnUser(Long userid) {
        return userRepository.getPlaylistOnUser(userid);
    }

    @Override
    public boolean checkCredentials(String username, String password) {
        User user = this.getUserByUsername(username);

        if (user == null) {
            return false;
        }

        return encoder.matches(password, user.getPassword());
    }

    @Override
    public void login(String username) {
        User user = this.getUserByUsername(username);
        this.loggedUser.setId(user.getId());
        this.loggedUser.setUsername(user.getUsername());
    }

    @Override
    public boolean findUserByUsername(String value) {
        User user = userRepository.findByUsername(value).orElse(null);
        if(user != null){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean findUserByEmail(String value) {
        User user = userRepository.findByEmail(value).orElse(null);
        if(user != null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void register(RegisterDTO registerDTO) {
        this.userRepository.save(this.mapUser(registerDTO));
        this.login(registerDTO.getUsername());
    }

    @Override
    public void logout() {
        this.session.invalidate();
        this.loggedUser.setId(null);
        this.loggedUser.setUsername(null);
    }

    private User getUserByUsername(String username) {
        return this.userRepository.findByUsername(username).orElse(null);
    }
    private User mapUser(RegisterDTO registerDTO) {
        User user = new User();
        user.setUsername(registerDTO.getUsername());
        user.setEmail(registerDTO.getEmail());
        user.setPassword(encoder.encode(registerDTO.getPassword()));
        return user;
    }
}
