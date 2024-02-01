package com.spring.docker.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Capitalcontroller {
    @GetMapping("/{name}")
    public String showname(@PathVariable(value="name") String name)
    {
        return name.toUpperCase();
    }



}
