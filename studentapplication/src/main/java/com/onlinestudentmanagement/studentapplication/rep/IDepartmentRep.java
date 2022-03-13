package com.onlinestudentmanagement.studentapplication.rep;

import com.onlinestudentmanagement.studentapplication.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRep extends JpaRepository<Department,Long> {
}
