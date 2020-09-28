package com.julianlin.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners") //router-like stuff
@Controller
public class OwnerController {
    @RequestMapping({"/","/index","/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
