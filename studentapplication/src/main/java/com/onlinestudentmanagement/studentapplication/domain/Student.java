package com.onlinestudentmanagement.studentapplication.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "student_name")
    private String names;
    @Column(name = "gender")
    private Egender gender;
    @Column(name = "dob")
    private LocalDate dob;
    @Column(name = "address")
    private String address;
    @ManyToMany(mappedBy = "students")
    private Set<Course> courses = new HashSet<>();
    @ManyToOne
    private Faculty faculty ;
    @ManyToOne
    private Department department;

    public Student() {
    }

    public Student(String names, Egender gender, LocalDate dob, String address) {
        this.names = names;
        this.gender = gender;
        this.dob = dob;
        this.address = address;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Egender getGender() {
        return gender;
    }

    public void setGender(Egender gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", courses=" + courses +
                ", faculty=" + faculty +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
