package com.springmvc.pmvc.controllers;
import com.springmvc.pmvc.beans.Course;
import com.springmvc.pmvc.dao.CourseDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
@RequestMapping("/course")
public class CourseController {
    //private CourseDAO courseDAO;
    
    @Autowired
    private CourseDAO courseDAO; // Fix: Add @Autowired

    @PostMapping("/register")
    public String registerCourse(@ModelAttribute("course") Course course) {
        courseDAO.registerCourse(course);
        return "redirect:/";}
}