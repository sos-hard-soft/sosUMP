/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sos.ump.scolarite.controllers;

import com.sos.helpers.Casting;
import com.sos.helpers.util.JsfUtil;
import com.sos.ump.scolarite.model.Student;
import com.sos.ump.scolarite.model.apogee.Individu;
import com.sos.ump.scolarite.model.apogee.InsAdmEtp;
import com.sos.ump.scolarite.services.StudentFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;

/**
 *
 * @author mabsalhi.sos
 */
@Named(value = "stdController")
@SessionScoped
public class StudentController implements Serializable {

    @EJB
    private StudentFacade studentService;
    
    private List<InsAdmEtp> listInscriptions;   
    
    private Casting casting = new Casting();
    
    private Student newStudent = new Student();
    private Student current;
    
    private Individu apoStudent = new Individu();
    
    private List<Student> studentList;
    
    /**
     * Business Methods
     * 
     */
    public String showResult(){
        String cne = apoStudent.getCodNneInd();
        String cin = apoStudent.getCinInd();
        System.out.println("Le cne saisi est : " + cne + " et Le cin saisi est : " + cin);
        
        System.out.println("Debut de la transaction DB ORACLE");
        apoStudent = studentService.findApoStudent(cne, cin);
        if (apoStudent == null) {
            System.out.println("Les données Saisi sont incorrect");
        }else{
            System.out.println("Recherche des inscriptions");
            listInscriptions = studentService.findInscAdministrative(apoStudent.getCodEtu());
        System.out.println("l'eudiant est : " + apoStudent.getLibNomPatInd() + " ---- " + apoStudent.getLibPr1Ind());
            createStudentFromIndividu(apoStudent);
        }
        
        
        return "/student/student?faces-redirect=true";
    }
    
    public void createStudentFromIndividu(Individu individu){
        
        
        newStudent.setCin(individu.getCinInd());
        newStudent.setCne(casting.ConvertToLong(individu.getCodNneInd()));
        newStudent.setCodApo((long) individu.getCodEtu());
        
        newStudent.setDateOfBirth(individu.getDateNaiInd());
        newStudent.setBirthPlace(individu.getLibVilNaiEtu());
        newStudent.setBirthPlaceAr(individu.getLibVilNaiEtuArb());
        
        newStudent.setFirstName(individu.getLibNomPatInd());
        newStudent.setLastName1(individu.getLibPr1Ind());
        newStudent.setLastName2(individu.getLibPr2Ind());
        newStudent.setF_name_ar(individu.getLibNomIndArb());
        newStudent.setL_name_ar(individu.getLibPrnIndArb());
        System.out.println("Persistence vers base locale");
        
        try {
            studentService.create(newStudent);
        } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
    }
    
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

    public Individu getApoStudent() {
        return apoStudent;
    }

    public void setApoStudent(Individu apoStudent) {
        this.apoStudent = apoStudent;
    }

    public Casting getCasting() {
        return casting;
    }

    public void setCasting(Casting casting) {
        this.casting = casting;
    }

    public List<InsAdmEtp> getListInscriptions() {
        return listInscriptions;
    }

    public void setListInscriptions(List<InsAdmEtp> listInscriptions) {
        this.listInscriptions = listInscriptions;
    }
    
    
    
}
