package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;


@Controller
public class ViewController {



    @GetMapping("/test")
    public String view(HttpServletRequest request) {
        String[] list = {"test","bruh","yeet"};
        request.setAttribute("messages", list);

        return "view";
    }
}

