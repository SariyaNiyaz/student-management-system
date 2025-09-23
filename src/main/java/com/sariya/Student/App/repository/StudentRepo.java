package com.sariya.Student.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sariya.Student.App.models.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
    public Student findByEmail(String email);
    public Student findByRollno(String rollno);
}
