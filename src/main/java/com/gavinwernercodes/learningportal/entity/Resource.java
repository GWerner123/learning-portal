package com.gavinwernercodes.learningportal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "resources")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resource_id;


    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;
}
