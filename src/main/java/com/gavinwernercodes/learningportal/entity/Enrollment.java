package com.gavinwernercodes.learningportal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrollmentId;


    // relationships

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "progress_id")
    private Progress progress;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
