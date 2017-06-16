package com.sprhib.controller;

import com.sprhib.service.BootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ja on 15.06.2017.
 */
@Controller
public class HomeController {

    @Autowired
    private BootService bootService;

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("greeting", "Witaj w sklepie internetowym!");
        model.addAttribute("tagline", "Wyjątkowym i jedynym sklepie internetowym");
        model.addAttribute("boots1", bootService.getBoots4I());
        return "forward:/welcome/greeting";
    }
    @RequestMapping("/welcome/greeting")
    public String greeting() {
        return "welcome";
    }
}
