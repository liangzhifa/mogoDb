package com.zhifa.mogo;

import com.zhifa.mogo.entity.Student;
import com.zhifa.mogo.repository.StudentRepository;
import com.zhifa.mogo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class MogoApplicationTests {

    @Autowired
    private StudentService studentService;


    @Autowired
    private StudentRepository studentRepository;


    @Test
    void contextLoads() {

    }
    @Test
    void add() {
        Student student = Student.builder()
                .studentId("11")
                .age(6)
                .name("嘤嘤嘤")
                .gender("男")

                .build();

        Student addStudent = studentService.addStudent(student);
        System.out.println(addStudent);

    }

    @Test
    void select() {


    }

}
