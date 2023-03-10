package com.commercetools.sdk.examples.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppContoller {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("t", "T");
        model.addAttribute("project", "World");
        return "home/index";
    }
}
