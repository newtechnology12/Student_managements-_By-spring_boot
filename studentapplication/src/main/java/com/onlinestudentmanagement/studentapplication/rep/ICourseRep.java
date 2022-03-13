package com.onlinestudentmanagement.studentapplication.rep;

import com.onlinestudentmanagement.studentapplication.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRep extends JpaRepository<Course,Long> {
}
