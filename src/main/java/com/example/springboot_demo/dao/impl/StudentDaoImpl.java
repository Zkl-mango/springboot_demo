package com.example.springboot_demo.dao.impl;

import com.example.springboot_demo.dao.StudentDao;
import com.example.springboot_demo.entity.StudentEntity;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Resource
    SqlSessionTemplate sqlSessionTemplate;

    @Override
    public void addStudent(StudentEntity student) {
        sqlSessionTemplate.insert("StudentDao.addStudent",student);
    }

    @Override
    public void updateStudent(StudentEntity student) {
        sqlSessionTemplate.update("StudentDao.updateStudent",student);
    }

    @Override
    public void deleteStudent(StudentEntity student) {
        sqlSessionTemplate.delete("StudentDao.updateStudent",student);
    }

    @Override
    public StudentEntity getStudentByNumber(String id) {
        return sqlSessionTemplate.selectOne("StudentDao.getStudentByNumber",id);
    }

    @Override
    public List<StudentEntity> getAllStudent() {
        return sqlSessionTemplate.selectList("StudentDao.getAllStudent");
    }

}
