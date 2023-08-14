package com.gavinwernercodes.learningportal.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "quizzes")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quiz_id;


    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    @OneToMany(mappedBy = "quiz")
    private List<Question> questions;
}
