package com.example.springboot_demo.service.impl;

import com.example.springboot_demo.dao.StudentDao;
import com.example.springboot_demo.entity.StudentEntity;
import com.example.springboot_demo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentDao studentDao;

    @Override
    public void addStudent(StudentEntity student) {
        studentDao.addStudent(student);
    }

    @Override
    public void updateStudent(StudentEntity student) {
        studentDao.updateStudent(student);
    }

    @Override
    public void deleteStudent(StudentEntity student) {
        studentDao.deleteStudent(student);
    }

    @Override
    public StudentEntity getOneStudent(String id) {
        return studentDao.getStudentByNumber(id);
    }

    @Override
    public List<StudentEntity> getAllStudent() {
        return studentDao.getAllStudent();
    }
}
