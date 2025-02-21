package com.springmvc.pmvc.controllers;

import com.springmvc.pmvc.beans.FacultyCourseAssignment;
import com.springmvc.pmvc.dao.FacultyCourseAssignmentDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
@RequestMapping("/assignment")
public class AssignmentController {
	@Autowired
    private FacultyCourseAssignmentDAO assignmentDAO;

    @PostMapping("/assign")
    public String assignFacultyToCourse(@ModelAttribute("assignment") FacultyCourseAssignment assignment) {
        assignmentDAO.assignFacultyToCourse(assignment);
        return "redirect:/";}
}