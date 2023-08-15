package com.gavinwernercodes.learningportal.repository;

import com.gavinwernercodes.learningportal.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {

}
