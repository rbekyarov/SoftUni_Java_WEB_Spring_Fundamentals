package com.example.spotifyplaylistapp.controller;

import com.example.spotifyplaylistapp.model.entity.Song;
import com.example.spotifyplaylistapp.service.SongService;
import com.example.spotifyplaylistapp.service.UserService;
import com.example.spotifyplaylistapp.util.LoggedUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;



@Controller
public class HomeController extends BaseController{
    private final LoggedUser loggedUser;
    private final SongService songService;
    private final UserService userService;

    public HomeController(LoggedUser loggedUser, SongService songService, UserService userService) {
        this.loggedUser = loggedUser;
        this.songService = songService;
        this.userService = userService;
    }

    @GetMapping("/index")
    public ModelAndView index() {
        if(loggedUser.isLogged()){
            return super.redirect("/home");

        }
        return  super.view("/index");


    }


    @GetMapping("/home")
    public ModelAndView home(ModelAndView modelAndView) {
        if (!loggedUser.isLogged()) {
            return super.redirect("/index");

        }
       List<Song> songsPop = songService.getSongsPop();
       List<Song> songsRock = songService.getsongsRock();
       List<Song> songsJazz = songService.getsongsJazz();
        modelAndView.addObject("songsPop",songsPop );
        modelAndView.addObject("songsRock",songsRock);
        modelAndView.addObject("songsJazz", songsJazz);
        Long userid = loggedUser.getId();
        List <Song> playlist = userService.getPlaylistOnUser(userid);
        modelAndView.addObject("playlist", playlist);

        return super.view("/home","songsPop",songsPop,"songsRock",songsRock,"songsJazz", songsJazz,"playlist", playlist);
    }
}
