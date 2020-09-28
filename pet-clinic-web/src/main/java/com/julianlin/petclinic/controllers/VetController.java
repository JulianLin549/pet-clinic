package com.julianlin.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets") //router-like stuff
@Controller
public class VetController {
    @RequestMapping({"/", "/index", "/index.html"})
    public String listVets(){
        return "vets/index" ;
    }
}
