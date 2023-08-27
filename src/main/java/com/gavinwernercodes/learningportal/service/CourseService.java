package com.gavinwernercodes.learningportal.service;

import com.gavinwernercodes.learningportal.entity.Course;
import com.gavinwernercodes.learningportal.repository.CourseRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Transactional
    public void createCourse(Course course) {
        courseRepository.save(course);
    }
}
