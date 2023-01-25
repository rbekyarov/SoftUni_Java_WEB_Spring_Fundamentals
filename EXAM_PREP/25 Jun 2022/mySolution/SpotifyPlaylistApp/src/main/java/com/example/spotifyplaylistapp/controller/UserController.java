package com.example.spotifyplaylistapp.controller;

import com.example.spotifyplaylistapp.model.entity.dto.LoginDTO;
import com.example.spotifyplaylistapp.model.entity.dto.RegisterDTO;
import com.example.spotifyplaylistapp.service.UserService;
import com.example.spotifyplaylistapp.util.LoggedUser;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController extends BaseController{
private final LoggedUser loggedUser;
private final ModelMapper modelMapper;
private final UserService userService;

    public UserController(LoggedUser loggedUser, ModelMapper modelMapper, UserService userService) {
        this.loggedUser = loggedUser;
        this.modelMapper = modelMapper;
        this.userService = userService;
    }


    @GetMapping("/login")
    public ModelAndView login() {
        if (this.loggedUser.isLogged()) {
            return super.redirect("/home");

        }
        return super.view("/login");
    }

    @PostMapping("/login")
    public String loginConfirm(@Valid LoginDTO loginDTO, BindingResult result, RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            redirectAttributes
                    .addFlashAttribute("loginDTO", loginDTO)
                    .addFlashAttribute("org.springframework.validation.BindingResult.loginDTO", result);

            return "redirect:/login";
        }

        boolean validCredentials = this.userService.checkCredentials(loginDTO.getUsername(), loginDTO.getPassword());

        if (!validCredentials) {
            redirectAttributes
                    .addFlashAttribute("loginDTO", loginDTO)
                    .addFlashAttribute("validCredentials", false);
            return "redirect:/login";
        }

        this.userService.login(loginDTO.getUsername());
        return "redirect:/home";
    }
    @GetMapping("/register")
    public ModelAndView register() {

    if (this.loggedUser.isLogged()) {
        return super.redirect("/home");

    }
        return super.view("/register");
}

    @PostMapping("/register")
    public String registerConfirm(@Valid RegisterDTO registerDTO, BindingResult result, RedirectAttributes redirectAttributes) {
        if (!registerDTO.getPassword().equals(registerDTO.getConfirmPassword())) {
            result.addError(
                    new FieldError(
                            "differentConfirmPassword",
                            "confirmPassword",
                            "Passwords must be the same."));
        }

        if (result.hasErrors()) {
            redirectAttributes
                    .addFlashAttribute("registerDTO", registerDTO)
                    .addFlashAttribute("org.springframework.validation.BindingResult.registerDTO", result);

            return "redirect:/register";
        }

        this.userService.register(registerDTO);
        return "redirect:/home";
    }


    @GetMapping("/logout")
    public ModelAndView logout() {
        if (!this.loggedUser.isLogged()) {
            return super.redirect("/login");

        }

        this.userService.logout();
        return super.redirect("/");

    }
}
