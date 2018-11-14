package com.geekshubsacademy.proyectocrudjava.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String inicio(){
        return "index";
    }
}
