package cc.yh.thymeleaf.view.service;

import cc.yh.thymeleaf.view.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectList(Student student);

}
