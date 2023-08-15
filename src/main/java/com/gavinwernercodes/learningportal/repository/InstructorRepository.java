package com.gavinwernercodes.learningportal.repository;

import com.gavinwernercodes.learningportal.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository <Instructor, Long> {

}
