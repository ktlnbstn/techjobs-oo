package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Idea created by LaunchCode
 * Idea coded by Kate Boston
 */
@Controller
public class HomeController {

    @RequestMapping(value = "")
    public String index() {
        return "index";
    }

}
