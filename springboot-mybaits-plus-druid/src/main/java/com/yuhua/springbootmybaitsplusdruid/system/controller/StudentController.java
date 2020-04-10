package com.yuhua.springbootmybaitsplusdruid.system.controller;

import com.yuhua.springbootmybaitsplusdruid.system.entity.Student;
import com.yuhua.springbootmybaitsplusdruid.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List list(Student student) {
        return studentService.selectList(student);
    }

}