package com.gavinwernercodes.learningportal.controller;

import com.gavinwernercodes.learningportal.entity.Instructor;
import com.gavinwernercodes.learningportal.entity.Student;
import com.gavinwernercodes.learningportal.service.RegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/instructor")
    public void createInstructor(@RequestBody Instructor instructor) {
        registrationService.createInstructor(instructor);
    }

    @PostMapping("/student")
    public void createStudent(@RequestBody Student student) {
        registrationService.createStudent(student);
    }
}
