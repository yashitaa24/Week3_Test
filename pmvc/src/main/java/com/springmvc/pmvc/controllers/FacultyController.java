package com.springmvc.pmvc.controllers;
import com.springmvc.pmvc.beans.Faculty;
import com.springmvc.pmvc.dao.FacultyDAO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/faculty")
public class FacultyController {
	@Autowired
    private FacultyDAO facultyDAO;

    @PostMapping("/register")
    public String registerFaculty(@ModelAttribute("faculty") Faculty faculty) {
        facultyDAO.registerFaculty(faculty);
        return "redirect:/";}
}