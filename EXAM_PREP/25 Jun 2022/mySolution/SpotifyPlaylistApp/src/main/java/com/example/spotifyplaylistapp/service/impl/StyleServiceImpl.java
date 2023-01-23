package com.example.spotifyplaylistapp.service.impl;

import com.example.spotifyplaylistapp.model.entity.Style;
import com.example.spotifyplaylistapp.model.entity.Styles;
import com.example.spotifyplaylistapp.repository.StyleRepository;
import com.example.spotifyplaylistapp.service.StyleService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class StyleServiceImpl implements StyleService {
    private final StyleRepository styleRepository;

    public StyleServiceImpl(StyleRepository styleRepository) {
        this.styleRepository = styleRepository;
    }

    @Override
    public void initStyles() {
        if(styleRepository.count()==0){
            Styles[] values = Styles.values();
            Arrays.stream(values)
                    .forEach(_style -> {
                        Style style = new Style();
                        style.setStyleName(_style);
                        style.setDescription("...");

                        this.styleRepository.save(style);
                    });
        }

    }
}
