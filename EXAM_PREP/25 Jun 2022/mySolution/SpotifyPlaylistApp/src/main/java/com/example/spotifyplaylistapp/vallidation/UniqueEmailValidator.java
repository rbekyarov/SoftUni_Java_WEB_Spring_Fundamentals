package com.example.spotifyplaylistapp.vallidation;



import com.example.spotifyplaylistapp.service.UserService;
import com.example.spotifyplaylistapp.service.impl.UserServiceImpl;
import com.example.spotifyplaylistapp.vallidation.annotation.UniqueEmail;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    private final UserService userService;

    public UniqueEmailValidator(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return this.userService.findUserByEmail(value);
    }
}