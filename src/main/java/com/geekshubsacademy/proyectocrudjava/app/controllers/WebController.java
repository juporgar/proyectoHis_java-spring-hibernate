package com.geekshubsacademy.proyectocrudjava.app.controllers;

import com.geekshubsacademy.proyectocrudjava.domain.entities.Pacientes;
import com.geekshubsacademy.proyectocrudjava.domain.services.IPacientesService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Controller
public class WebController {

    private static final Log logger = LogFactory.getLog("WebController.class");

    @Autowired
    private IPacientesService pacientesService;

    @GetMapping("/")
    public String inicio(){
        logger.info("Guardando nuevo paciente");
        DateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
        Date date= new Date();
        dateFormat.format(date);
        Pacientes paciente = new Pacientes("hc123","Julian","Portalés García", date);
        pacientesService.save(paciente);
        logger.info(pacientesService.findOne(1L));
        logger.info("Borrando paciente");
        pacientesService.delete(1L);
        return "index";
    }
}
