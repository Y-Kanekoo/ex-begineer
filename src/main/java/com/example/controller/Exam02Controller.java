package com.example.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

    @Autowired
    private HttpSession session;

    @GetMapping("")
    public String index(){
        return "exam02";
    }

    @PostMapping("/sum_num")
    public String sumNum(Integer num1, Integer num2){
        session.setAttribute("num1", num1);
        session.setAttribute("num2",num2);
        session.setAttribute("result", num1 + num2);
        return "exam02-result";
    }

    @GetMapping("/sum_num2")
    public String sumNum2(){
        return "exam02-result2";
    }
}
