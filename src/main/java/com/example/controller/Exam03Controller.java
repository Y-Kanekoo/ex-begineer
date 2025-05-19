package com.example.controller;

import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

    @Autowired
    private ServletContext application;

    @GetMapping("")
    public String index(){
        return "exam03";
    }

    @RequestMapping("/purchase")
    public String purchase(Integer item1, Integer item2, Integer item3){
        int total = item1 + item2 + item3;
        int totalwithtax = (int) (total * 1.1);
        application.setAttribute("total",total);
        application.setAttribute("totalwithtax", totalwithtax);
        return "exam03-result";
    }
}
