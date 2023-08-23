package com.gavinwernercodes.learningportal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "resources")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resourceId;


    // relationships

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;
}
