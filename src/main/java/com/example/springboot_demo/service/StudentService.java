package com.example.springboot_demo.service;

import com.example.springboot_demo.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    /**
     * 添加一个学生
     * @param student 学生实体
     */
    public void addStudent(StudentEntity student);

    /**
     * 更新一个学生
     * @param student 学生实体
     */
    public void updateStudent(StudentEntity student);

    /**
     * 删除一个学生
     * @param student 学生实体
     */
    public void deleteStudent(StudentEntity student);

    public StudentEntity getOneStudent(String id);

    /**
     * 获取全部学生
     * @return
     */
    public List<StudentEntity> getAllStudent();

}
