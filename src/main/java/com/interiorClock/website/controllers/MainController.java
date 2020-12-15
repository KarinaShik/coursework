package com.interiorClock.website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String Home(Model model) {
        model.addAttribute("title", "Home");
        return "index";
    }

    @GetMapping("/shop")
    public String Shop(Model model) {
        model.addAttribute("title", "Shop");
        return "shop";
    }

    @GetMapping("/product")
    public String Product(Model model) {
        model.addAttribute("title", "Product");
        return "product-details";
    }

    @GetMapping("/contact")
    public String Contact(Model model) {
        model.addAttribute("title", "Contact us");
        return "contact-us";
    }

    @GetMapping("/account")
    public String Account(Model model) {
        model.addAttribute("title", "Account");
        return "my-account";
    }

    @GetMapping("/authorization")
    public String Authorization(Model model) {
        model.addAttribute("title", "Authorization");
        return "login-register";
    }
}
