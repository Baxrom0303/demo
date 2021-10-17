package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class HelloController {

    @GetMapping("/")
    public String getIndexPage(Model model){
        model.addAttribute("msg","Hello World!");
        return "index";
    }
}
