package com.zhifa.mogo.service;

import com.zhifa.mogo.entity.Student;

import java.util.List;

public interface StudentService {

    Student addStudent(Student student);

    void deleteStudent(String id);

    Student updateStudent(Student student);

    Student findStudentById(String id);

    List<Student> findAllStudent();

}
