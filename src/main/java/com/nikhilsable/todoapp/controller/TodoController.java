package com.nikhilsable.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {
    @GetMapping({"","/","/home"})
    public String getHomepage(){
        return "index";
    }
}
