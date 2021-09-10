package com.cuongnghiem.springbootjokesapp.controllers;

import com.cuongnghiem.springbootjokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cuongnghiem on 10/09/2021
 **/

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", "/"})
    public String getJokes(Model model){
        model.addAttribute("joke", jokesService.getJoke());

        return "index";
    }
}
