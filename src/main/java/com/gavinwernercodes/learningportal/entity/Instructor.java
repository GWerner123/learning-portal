package com.gavinwernercodes.learningportal.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "instructors")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_id")
    private Long instructor_id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;



    @OneToMany(mappedBy = "instructor")
    private List<Course> courses;


    // getter and setter for instructor_id
    public Long getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(Long instructor_id) {
        this.instructor_id = instructor_id;
    }

    // getter and setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // getter and setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
