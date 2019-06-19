package com.example.springboot_demo.dao;

import com.example.springboot_demo.entity.StudentEntity;

import java.util.List;

public interface StudentDao {

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

    /**
     *
     * @param id 学号
     * @return 学生实体
     */
    public StudentEntity getStudentByNumber(String id);

    /**
     * 读取所有的学生
     * @return 学生实体列表
     */
    public List<StudentEntity> getAllStudent();

}
