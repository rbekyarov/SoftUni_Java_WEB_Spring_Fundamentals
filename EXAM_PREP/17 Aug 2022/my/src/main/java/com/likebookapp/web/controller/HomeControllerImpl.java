package com.likebookapp.web.controller;

import com.likebookapp.model.entity.Post;
import com.likebookapp.model.entity.User;
import com.likebookapp.model.entity.dto.PostsWithUsernamesDTO;
import com.likebookapp.model.entity.dto.SongsByGenreDTO;
import com.likebookapp.service.impl.PostServiceImpl;
import com.likebookapp.service.impl.UserServiceImpl;
import com.likebookapp.util.LoggedUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Set;

public class HomeControllerImpl implements HomeController {
    private final LoggedUser loggedUser;
    private final PostServiceImpl postService;
    private final UserServiceImpl userService;

    public HomeControllerImpl(LoggedUser loggedUser,
                              PostServiceImpl postService,
                              UserServiceImpl userService) {
        this.loggedUser = loggedUser;
        this.postService = postService;
        this.userService = userService;
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

        User user = userService.findUserById(loggedUser.getId()).orElse(null);

        model.addAttribute("currentUserInfo", user);
        Set<Post> postsFromCurrentUser = this.postService.getPostsFromCurrentUser(this.loggedUser.getId());
        model.addAttribute("userPosts", postsFromCurrentUser);
        Set<PostsWithUsernamesDTO> postsFromOtherUsers = this.postService.getPostsFromOtherUsers(this.loggedUser.getId());
        model.addAttribute("otherUserPosts", postsFromOtherUsers);
        model.addAttribute("user", user);

        return "home";
    }


    @ModelAttribute
    public SongsByGenreDTO songs() {
        return new SongsByGenreDTO();
    }
}
