package com.spotifyplaylist.service;

import com.spotifyplaylist.model.entity.Style;
import com.spotifyplaylist.model.entity.Styles;
import com.spotifyplaylist.repo.StyleRepo;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class StyleServiceImpl implements StyleService {

    private final StyleRepo repo;

    public StyleServiceImpl(StyleRepo repo) {
        this.repo = repo;
    }

    @Override
    public void initStyles() {
        if (this.repo.count() != 0) {
            return;
        }

        Arrays.stream(Styles.values())
                .forEach(_style -> {
                    Style style = new Style();
                    style.setStyleName(_style);
                    style.setDescription("...");

                    this.repo.save(style);
                });

    }

    @Override
    public Style findStyle(Styles style) {
        return this.repo.findByStyleName(style).orElseThrow();
    }

    @Override
    public Style findStyleByStyleName(Styles styleName) {
        return this.repo.findByStyleName(styleName).orElseThrow();
    }
}
