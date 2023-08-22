package com.gavinwernercodes.learningportal.repository;

import com.gavinwernercodes.learningportal.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository <Course, Long> {
}
