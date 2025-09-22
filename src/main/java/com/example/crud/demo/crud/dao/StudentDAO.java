package com.example.crud.demo.crud.dao;

import com.example.crud.demo.crud.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void updateStudent(Student theStudent);

    void deleteStudent(Integer Id);


}
