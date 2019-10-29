package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.java.dao.StudentDAOImpl;
import com.java.model.Student;

@RestController
public class StudentController
{
    @Autowired
    private StudentDAOImpl studentDAOImpl;
    
   
    @RequestMapping(value="/create", method=RequestMethod.POST, 
            produces="application/json", consumes="application/json")
    public void createStudent(@RequestBody Student student)
    {
        studentDAOImpl.createStudent(student);
    }
    
    
    @RequestMapping(value="/student/{id}",produces="application/json",
            method=RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") long id)
    {
        Student student = studentDAOImpl.getStudentById(id);
        return student;
    }
    
    
    @RequestMapping(value="/students",produces="application/json",
            method=RequestMethod.GET)
    public List<Student> getAllStudents()
    {
        List<Student> studentList = studentDAOImpl.getAllStudents();
        return studentList;
    }
    
    
    @RequestMapping(value="/update", method=RequestMethod.PUT, 
            produces="application/json", consumes="application/json")
    public void updateStudent(@RequestBody Student student)
    {
        studentDAOImpl.updateStudent(student);
    }
    
    
    @RequestMapping(value="/delete/{id}",produces="application/json")
    public void deleteStudent(@PathVariable("id") long id)
    {
        studentDAOImpl.deleteStudent(id);
    }
}
