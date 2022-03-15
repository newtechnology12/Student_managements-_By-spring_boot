package com.onlinestudentmanagement.studentapplication.implement;

import com.onlinestudentmanagement.studentapplication.domain.*;
import com.onlinestudentmanagement.studentapplication.rep.ICourseRep;
import com.onlinestudentmanagement.studentapplication.rep.IDepartmentRep;
import com.onlinestudentmanagement.studentapplication.rep.IFacultyRep;
import com.onlinestudentmanagement.studentapplication.rep.IStudentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class StudentImplement implements CommandLineRunner {
    private final IStudentRep studentRep;
    private final ICourseRep courseRep;
    private final IFacultyRep facultyRep;
    private final IDepartmentRep departmentRep;

    public StudentImplement(IStudentRep studentRep, ICourseRep courseRep, IFacultyRep facultyRep, IDepartmentRep departmentRep) {
        this.studentRep = studentRep;
        this.courseRep = courseRep;
        this.facultyRep = facultyRep;
        this.departmentRep = departmentRep;
    }

    @Override
    public void run(String... args) throws Exception {
        Faculty it = new Faculty("IT");
        Faculty theology = new Faculty("Theology");
        facultyRep.save(it);
        facultyRep.save(theology);

        Student celstin = new Student("celestin",Egender.MALE,LocalDate.of(1988,02,02),"kigali");
        Course java = new Course("java",4,15000);
        celstin.getCourses().add(java);
        java.getStudents().add(celstin);
        studentRep.save(celstin);
        courseRep.save(java);
        
        Department inforManagement = new Department();
        inforManagement.setName("software eng");
        inforManagement.setFaculty(it);
        inforManagement.setFaculty(theology);




        departmentRep.save(inforManagement);
        System.out.println(" The department number of faculty" + it.getDepartments().size());

        System.out.println("The number of faculty are : " + facultyRep.count());
        System.out.println("The number of department are : " +departmentRep.count());

        
        System.out.println("the number of student is "+studentRep.count());
        System.out.println("the number of course is "+courseRep.count());



    }
}
