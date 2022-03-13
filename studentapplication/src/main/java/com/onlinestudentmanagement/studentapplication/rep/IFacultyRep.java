package com.onlinestudentmanagement.studentapplication.rep;

import com.onlinestudentmanagement.studentapplication.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacultyRep extends JpaRepository<Faculty,Long> {
}
