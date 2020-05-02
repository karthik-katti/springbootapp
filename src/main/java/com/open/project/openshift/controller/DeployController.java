package com.open.project.openshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {

    @GetMapping("/")
    public String welcome(){
        return "App is up and running";
    }
    @GetMapping("/{input}")
    public String welcomeUser(@PathVariable("input") String input){
        return "Hello :"+input+" you app is up and running";
    }

}
