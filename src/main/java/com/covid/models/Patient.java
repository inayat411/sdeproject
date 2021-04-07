/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.covid.models;

import java.time.LocalDate;
import javax.persistence.ManyToOne;

/**
 *
 * @author samso
 */
public class Patient {
    
    private String name;
    private String PatientId;
    private LocalDate birthdate;
    private String Gender;
    private String Email;
    
    @ManyToOne
    PatientAccount patientaccount;

    public Patient() {
    }

    public Patient(String name, String PatientId, LocalDate birthdate, String Gender, String Email) {
        this.name = name;
        this.PatientId = PatientId;
        this.birthdate = birthdate;
        this.Gender = Gender;
        this.Email = Email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatientId() {
        return PatientId;
    }

    public void setPatientId(String PatientId) {
        this.PatientId = PatientId;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", PatientId=" + PatientId + ", birthdate=" + birthdate + ", Gender=" + Gender + ", Email=" + Email + '}';
    }
  
}
