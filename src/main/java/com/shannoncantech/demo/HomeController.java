package com.shannoncantech.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @GetMapping("/movieform")
    public String loadMovieForm(Model model){
        model.addAttribute("movie", new Movie());
        return "movieform";
    }

    @PostMapping("/movieform")
    public String processMovieForm(@Valid Movie movie, BindingResult result){
        if (result.hasErrors()){
            return "movieform";
        }
        return "movieconfirm";
    }

}
