package com.geekshubsacademy.proyectocrudjava.app.controllers;

import com.geekshubsacademy.proyectocrudjava.domain.services.IPacientesService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    private static final Log logger = LogFactory.getLog("WebController.class");

    @Autowired
    private IPacientesService pacientesService;

    @GetMapping("/")
    public String inicio(){
        logger.info(pacientesService.findAll());
        return "index";
    }
}
