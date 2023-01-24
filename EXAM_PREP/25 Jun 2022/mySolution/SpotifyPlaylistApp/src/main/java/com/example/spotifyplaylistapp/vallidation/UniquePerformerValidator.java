package com.example.spotifyplaylistapp.vallidation;

import com.example.spotifyplaylistapp.service.SongService;
import com.example.spotifyplaylistapp.service.impl.SongServiceImpl;
import com.example.spotifyplaylistapp.vallidation.annotation.UniquePerformer;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniquePerformerValidator implements ConstraintValidator<UniquePerformer, String> {

    private final SongService songService;

    public UniquePerformerValidator(SongServiceImpl songService) {
        this.songService = songService;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return this.songService.findSongByPerformer(value);
    }
}
