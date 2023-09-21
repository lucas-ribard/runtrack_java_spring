package com.example.demo.controller;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ViewController {
    @GetMapping("/Main")
    public String view(HttpServletRequest request) {
        String[] list = {"test","bruh","yeet","yote"};
        request.setAttribute("listes", list);
        return "view";
    }

    @PostMapping("/Main")
    public String greetingSubmit(@RequestParam String firstName, @RequestParam String lastName,@RequestParam int age, Model model) {
        //@Min(18)
        String message = "Bonjour, " + firstName + " " + lastName + " !";
        model.addAttribute("message", message);

        return "Response";
    }
}

