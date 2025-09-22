package com.example.crud.demo.crud.dao;

import com.example.crud.demo.crud.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);


}
