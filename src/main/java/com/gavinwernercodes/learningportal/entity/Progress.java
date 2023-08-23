package com.gavinwernercodes.learningportal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "progresses")
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long progressId;


    // relationships

    @OneToOne
    @JoinColumn(name = "enrollment_id")
    private Enrollment enrollment;
}
