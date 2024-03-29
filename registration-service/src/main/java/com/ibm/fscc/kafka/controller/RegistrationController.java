package com.ibm.fscc.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api")
public class RegistrationController {

    @Autowired
    private Environment env;

    @GetMapping(path = "/status/check")
    public String status() {
        return "Working on port " + env.getProperty("3308") + "!";
    }

}
