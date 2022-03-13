package com.onlinestudentmanagement.studentapplication.rep;

import com.onlinestudentmanagement.studentapplication.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRep extends JpaRepository<Student,Long> {
}
