package com.spotifyplaylist.controller;

import com.spotifyplaylist.model.dto.SongsByGenreDTO;
import com.spotifyplaylist.service.HomeServiceImpl;
import com.spotifyplaylist.service.SongServiceImpl;
import com.spotifyplaylist.util.LoggedUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeControllerImpl implements HomeController {

    private final LoggedUser loggedUser;
    private final HomeServiceImpl homeService;
    private final SongServiceImpl songService;

    public HomeControllerImpl(LoggedUser loggedUser, HomeServiceImpl homeService, SongServiceImpl songService) {
        this.loggedUser = loggedUser;
        this.homeService = homeService;
        this.songService = songService;
    }

    @Override
    public String index() {
        if (loggedUser.isLogged()) {
            return "redirect:/home";
        }

        return "index";
    }

    @Override
    public String home(Model model) {
        if (!loggedUser.isLogged()) {
            return "redirect:/";
        }

        model.addAttribute("songs", this.homeService.getSongs());
        model.addAttribute("playlist", this.songService.getPlaylist(loggedUser.getId()));

        return "home";
    }

    @Override
    public String addSongToPlaylist(Long id) {
        if (!loggedUser.isLogged()) {
            return "redirect:/users/login";
        }

        this.homeService.addSong(id, this.loggedUser.getId());
        return "redirect:/home";
    }

    @Override
    public String removeSongFromPlaylist(Long id) {
        if (!loggedUser.isLogged()) {
            return "redirect:/users/login";
        }

        this.homeService.removeSong(id, this.loggedUser.getId());
        return "redirect:/home";
    }

    @Override
    public String deleteAllFromPlaylist() {
        if (!loggedUser.isLogged()) {
            return "redirect:/users/login";
        }

        this.homeService.deleteAll(this.loggedUser.getId());
        return "redirect:/home";
    }

    @ModelAttribute
    public SongsByGenreDTO songs() {
        return new SongsByGenreDTO();
    }
}
