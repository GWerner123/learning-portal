package com.gavinwernercodes.learningportal.repository;

import com.gavinwernercodes.learningportal.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository <Lesson, Long> {
}
