package com.example.springboot_demo.controller;

import com.example.springboot_demo.entity.StudentEntity;
import com.example.springboot_demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentController {

    @Resource
    StudentService studentService;

    @RequestMapping(value= {"/","index.html"})
    public String getIndexPage(HttpServletRequest request , HttpServletResponse response) {
        request.setAttribute("data", studentService.getAllStudent());
        return "index";
    }

    @RequestMapping(value="add_student")
    @ResponseBody
    public Map<String,Object> getStudentInfo(String studentNumber, String studentName){
        Map<String,Object> resMap = new HashMap<String,Object>();
        StudentEntity student = new StudentEntity();
        student.setId(studentNumber);
        student.setName(studentName);
        studentService.addStudent(student);
        resMap.put("status", "ok");
        return resMap;
    }
}
