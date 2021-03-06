package cc.yh.thymeleaf.view.service.impl;

import cc.yh.thymeleaf.view.entity.Student;
import cc.yh.thymeleaf.view.mapper.StudentMapper;
import cc.yh.thymeleaf.view.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("studentService")
@Primary
public class StudentServiceImpl implements StudentService {
    private static final Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectList(Student student) {
        return studentMapper.selectList(student);
    }

}
