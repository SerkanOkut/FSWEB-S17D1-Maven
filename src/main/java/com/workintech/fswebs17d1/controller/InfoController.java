package com.workintech.fswebs17d1.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @Value("${course.name}")
    private String courseName;

    @Value("${project.developer.fullname}")
    private String developer;

    @GetMapping("/info")
    public String getInfo() {
        return "Course: " + courseName + ", Developer: " + developer;
    }
}