package com.example.spotifyplaylistapp.vallidation;

import com.example.spotifyplaylistapp.service.UserService;
import com.example.spotifyplaylistapp.service.impl.UserServiceImpl;
import com.example.spotifyplaylistapp.vallidation.annotation.UniqueUsername;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

    private final UserService userService;

    public UniqueUsernameValidator(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return this.userService.findUserByUsername(value);
    }
}