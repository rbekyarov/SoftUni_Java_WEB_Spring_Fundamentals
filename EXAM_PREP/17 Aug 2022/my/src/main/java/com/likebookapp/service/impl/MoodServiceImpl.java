package com.likebookapp.service.impl;

import com.likebookapp.model.entity.Mood;
import com.likebookapp.model.entity.MoodsEnum;
import com.likebookapp.repository.MoodRepository;
import com.likebookapp.service.MoodService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MoodServiceImpl implements MoodService {
    private final MoodRepository repo;

    public MoodServiceImpl(MoodRepository repo) {
        this.repo = repo;
    }

    @Override
    public void initMoods() {
        if (this.repo.count() != 0) {
            return;
        }

        Arrays.stream(MoodsEnum.values())
                .forEach(s -> {
                    Mood mood = new Mood();
                    mood.setMoodName(s);
                    mood.setDescription("...");

                    this.repo.save(mood);
                });

    }

    @Override
    public Mood findMood(MoodsEnum moodsEnum) {
        return this.repo.findByMoodName(moodsEnum).orElseThrow();
    }

    @Override
    public Mood findStyleByStyleName(MoodsEnum styleName) {
        return this.repo.findByMoodName(styleName).orElseThrow();
    }
}
