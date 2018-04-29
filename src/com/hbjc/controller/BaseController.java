package com.hbjc.controller;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

public class BaseController {

    private static final String VIEW_SUCCESS = "success";
    private static final String VIEW_ERROR = "error";



    public ModelAndView success() {
        ModelAndView mv = new ModelAndView(VIEW_SUCCESS);
        return mv;
    }

    public ModelAndView error() {
        ModelAndView mv = new ModelAndView(VIEW_ERROR);
        return mv;
    }


}
