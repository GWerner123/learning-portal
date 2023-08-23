package com.gavinwernercodes.learningportal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerId;

    @Column(name = "answer_text")
    private String answerText;

    @Column(name = "is_correct")
    private Boolean isCorrect;


    // relationships

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

}
