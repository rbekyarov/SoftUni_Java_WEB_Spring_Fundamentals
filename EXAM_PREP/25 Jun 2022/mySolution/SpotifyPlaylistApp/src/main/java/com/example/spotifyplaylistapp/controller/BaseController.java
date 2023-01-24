package com.example.spotifyplaylistapp.controller;

import org.springframework.web.servlet.ModelAndView;


import java.util.List;

public abstract class BaseController {

    public ModelAndView view(String view) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("view", view);


        return modelAndView;
    }
    public ModelAndView view(String view, String string1, List list1, String string2, List list2,  String string3, List list3,String string4, List list4) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("view", view);
        modelAndView.addObject(string1, list1);
        modelAndView.addObject(string2, list2);
        modelAndView.addObject(string3, list3);
        modelAndView.addObject(string4, list4);

        return modelAndView;
    }




    public ModelAndView redirect(String url) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:" + url);

        return modelAndView;
    }
}
