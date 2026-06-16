package com.mvcpratice.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class StudentController {
    // @ResponseBody
    @GetMapping("/student/home")
    public String showsStudentHomePage() {
        return "home-page";
    }

    @GetMapping("Student/home/v1")
    public String showsStudentHomePages() {
        return "home-page";

    }
}
