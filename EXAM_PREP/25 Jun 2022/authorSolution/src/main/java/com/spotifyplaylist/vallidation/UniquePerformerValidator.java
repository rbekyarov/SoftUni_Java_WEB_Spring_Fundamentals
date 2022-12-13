package com.spotifyplaylist.vallidation;

import com.spotifyplaylist.service.SongServiceImpl;
import com.spotifyplaylist.vallidation.annotation.UniquePerformer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniquePerformerValidator implements ConstraintValidator<UniquePerformer, String> {

    private final SongServiceImpl songService;

    public UniquePerformerValidator(SongServiceImpl songService) {
        this.songService = songService;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return this.songService.findSongByPerformer(value) == null;
    }
}
