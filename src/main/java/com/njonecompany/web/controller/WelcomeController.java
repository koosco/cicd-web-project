package com.njonecompany.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/")
    public String index(Model model) {
        logger.debug("Welcome to njonecompany.com...");

        model.addAttribute("msg", getMessage());
        model.addAttribute("today", new Date());
        System.out.println(model.getAttribute("today"));
        return "index";

    }

    private String getMessage() {
        return "Hi, there";
    }

    @ResponseBody
    @GetMapping("/koosco")
    public String koosco() {
        return "HI this is koosco";
    }

    @ResponseBody
    @GetMapping("/koo")
    public String koo() {
        return "This is koo method";
    }

    @ResponseBody
    @GetMapping("/test")
    public String test() {
        return "This is test method";
    }
}
