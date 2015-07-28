/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sos.ump.scolarite.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.validation.constraints.NotNull;

/**
 *
 * @author mab.salhi
 */
@Entity
@Table(name = "t_student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByIdStudent", query = "SELECT s FROM Student s WHERE s.idStudent = :idStudent"),
    @NamedQuery(name = "Student.findByCne", query = "SELECT s FROM Student s WHERE s.cne = :cne"),
    @NamedQuery(name = "Student.findByCin", query = "SELECT s FROM Student s WHERE s.cin = :cin"),
    @NamedQuery(name = "Student.findByNom", query = "SELECT s FROM Student s WHERE s.nom = :nom"),
    @NamedQuery(name = "Student.findByDateNaissance", query = "SELECT s FROM Student s WHERE s.dateNaissance = :dateNaissance")
    })
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id_student")
    private Long idStudent;
    
    @Version
    @Column(name = "version")    
    private Integer version;
    
    @Column(name = "cne")
    private Long cne;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cin")
    private String cin;
    
    @Column(name = "code_apogee")
    private Long codApo;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "f_name")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "l_name1")
    private String lastName1;
    @Column(name = "l_name2", nullable = true)
    private String lastName2;
    @Size(max = 255)
    @Column(name = "f_name_ar", nullable = true)
    private String f_name_ar;
    @Size(max = 255)
    @Column(name = "l_name_ar", nullable = true)
    private String l_name_ar;
    @Column(name = "date_of_birth", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Size(max = 255)
    @Column(name = "birth_place", nullable = true)
    private String birthPlace;
    @Size(max = 255)
    @Column(name = "phon_number", nullable = true)
    private String phonNumber;
    @Size(max = 255)
    @Column(name = "adress", nullable = true)
    private String adress;

    public Student() {
    }

    public Student(Long cne, String cin, String firstName, String lastName2) {
        this.cne = cne;
        this.cin = cin;
        this.firstName = firstName;
        this.lastName2 = lastName2;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getCne() {
        return cne;
    }

    public void setCne(Long cne) {
        this.cne = cne;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Long getCodApo() {
        return codApo;
    }

    public void setCodApo(Long codApo) {
        this.codApo = codApo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getF_name_ar() {
        return f_name_ar;
    }

    public void setF_name_ar(String f_name_ar) {
        this.f_name_ar = f_name_ar;
    }

    public String getL_name_ar() {
        return l_name_ar;
    }

    public void setL_name_ar(String l_name_ar) {
        this.l_name_ar = l_name_ar;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.idStudent);
        hash = 13 * hash + Objects.hashCode(this.version);
        hash = 13 * hash + Objects.hashCode(this.cne);
        hash = 13 * hash + Objects.hashCode(this.cin);
        hash = 13 * hash + Objects.hashCode(this.codApo);
        hash = 13 * hash + Objects.hashCode(this.firstName);
        hash = 13 * hash + Objects.hashCode(this.lastName1);
        hash = 13 * hash + Objects.hashCode(this.lastName2);
        hash = 13 * hash + Objects.hashCode(this.f_name_ar);
        hash = 13 * hash + Objects.hashCode(this.l_name_ar);
        hash = 13 * hash + Objects.hashCode(this.dateOfBirth);
        hash = 13 * hash + Objects.hashCode(this.birthPlace);
        hash = 13 * hash + Objects.hashCode(this.phonNumber);
        hash = 13 * hash + Objects.hashCode(this.adress);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.idStudent, other.idStudent)) {
            return false;
        }
        if (!Objects.equals(this.version, other.version)) {
            return false;
        }
        if (!Objects.equals(this.cne, other.cne)) {
            return false;
        }
        if (!Objects.equals(this.cin, other.cin)) {
            return false;
        }
        if (!Objects.equals(this.codApo, other.codApo)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName1, other.lastName1)) {
            return false;
        }
        if (!Objects.equals(this.lastName2, other.lastName2)) {
            return false;
        }
        if (!Objects.equals(this.f_name_ar, other.f_name_ar)) {
            return false;
        }
        if (!Objects.equals(this.l_name_ar, other.l_name_ar)) {
            return false;
        }
        if (!Objects.equals(this.dateOfBirth, other.dateOfBirth)) {
            return false;
        }
        if (!Objects.equals(this.birthPlace, other.birthPlace)) {
            return false;
        }
        if (!Objects.equals(this.phonNumber, other.phonNumber)) {
            return false;
        }
        if (!Objects.equals(this.adress, other.adress)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student : " + "cne : " + cne + ", cin : " + cin + ", codApo : " + codApo + ", firstName : " + firstName + ", lastName1 : " + lastName1 + '}';
    }
    
    
    
}
