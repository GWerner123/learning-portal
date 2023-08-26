package com.gavinwernercodes.learningportal.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lessonId;

    @Column(name = "lesson_title")
    private String lessonTitle;


    // relationships

    @OneToMany(mappedBy = "lesson")
    private List<Resource> resources;

    @OneToMany(mappedBy = "lesson")
    private List<Quiz> quizzes;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;



    // public getters and setters

    public Long getLessonId() {
        return lessonId;
    }

    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    public String getLessonTitle() {
        return lessonTitle;
    }

    public void setLessonTitle(String lessonTitle) {
        this.lessonTitle = lessonTitle;
    }
}
