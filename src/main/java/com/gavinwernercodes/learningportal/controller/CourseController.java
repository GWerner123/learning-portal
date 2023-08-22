package com.gavinwernercodes.learningportal.controller;

import com.gavinwernercodes.learningportal.entity.Course;
import com.gavinwernercodes.learningportal.service.CourseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/create")
    public void createCourse(@RequestBody Course course) {
        courseService.createCourse(course);
    }

}
