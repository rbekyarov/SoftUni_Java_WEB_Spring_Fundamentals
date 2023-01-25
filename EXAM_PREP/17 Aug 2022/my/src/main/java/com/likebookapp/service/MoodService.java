package com.likebookapp.service;

import com.likebookapp.model.entity.Mood;
import com.likebookapp.model.entity.MoodsEnum;

public interface MoodService {
    void initMoods();

    Mood findMood(MoodsEnum style);

    Mood findStyleByStyleName(MoodsEnum styleName);
}
