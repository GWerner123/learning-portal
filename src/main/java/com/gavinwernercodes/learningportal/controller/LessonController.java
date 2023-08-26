package com.gavinwernercodes.learningportal.controller;

import com.gavinwernercodes.learningportal.entity.Lesson;
import com.gavinwernercodes.learningportal.service.LessonService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson")
public class LessonController {

    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    public void createLesson(@RequestBody Lesson lesson) {
        lessonService.createLesson(lesson);
    }
}
