package com.gavinwernercodes.learningportal.service;

import com.gavinwernercodes.learningportal.entity.Course;
import com.gavinwernercodes.learningportal.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void createCourse(Course course) {
        courseRepository.save(course);
    }
}
