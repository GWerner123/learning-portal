package com.gavinwernercodes.learningportal.service;

import com.gavinwernercodes.learningportal.entity.Lesson;
import com.gavinwernercodes.learningportal.repository.LessonRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

    private final LessonRepository lessonRepository;

    public LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    @Transactional
    public void createLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }
}
