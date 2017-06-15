package com.sprhib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ja on 15.06.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("greeting", "Witaj w sklepie internetowym!");
        model.addAttribute("tagline", "Wyjątkowym i jedynym sklepie internetowym");

        return "forward:/welcome/greeting";
    }
    @RequestMapping("/welcome/greeting")
    public String greeting() {
        return "welcome";
    }
}
