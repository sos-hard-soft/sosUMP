/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sos.ump.scolarite.controllers;

import com.sos.ump.scolarite.model.Student;
import com.sos.ump.scolarite.services.StudentFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author mabsalhi.sos
 */
@Named(value = "studentController")
@SessionScoped
public class StudentController implements Serializable {

    @EJB
    private StudentFacade studentService;
    
    private Student newStudent;
    private Student current;
    
    private List<Student> studentList;
    
    /**
     * Creates a new instance of StudentController
     */
    public StudentController() {
    }
    
    public String showList(){
        studentList = studentService.findAll();
        return "student/list??faces-redirect=true";
    }

    public StudentFacade getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentFacade studentService) {
        this.studentService = studentService;
    }

    public Student getNewStudent() {
        return newStudent;
    }

    public void setNewStudent(Student newStudent) {
        this.newStudent = newStudent;
    }

    public Student getCurrent() {
        return current;
    }

    public void setCurrent(Student current) {
        this.current = current;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    
    
}
