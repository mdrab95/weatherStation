package com.weatherstation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    public MainController() {
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainController(){
        return "<html><title>Weather Station - info</title><body>"
                + "<h2>General information</h2>"
                + "<p>Encrypt your thingspeak password with com.weatherstation.util.PasswordEncrypter</p>"
                + "<p>Edit com.weatherstation.WeatherstationApplication - set your encrypted thingspeak password and list of sensors</p>"
                + "<p>build project with 'mvn clean install' command</p>"
                + "</body></html>";
    }
}
