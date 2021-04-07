/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.covid.models;

import java.util.List;
import javax.persistence.OneToMany;

/**
 *
 * @author samso
 */
public class PatientAccount {
    
    String PatientId;
    String PatientUser;
    String Password;
    
    @OneToMany(mappedBy = "PatientAccount")
    private List<Patient> Patients;

    public PatientAccount() {
    }

    public PatientAccount(String PatientId, String PatientUser, String Password) {
        this.PatientId = PatientId;
        this.PatientUser = PatientUser;
        this.Password = Password;
    }

    public String getPatientId() {
        return PatientId;
    }

    public void setPatientId(String PatientId) {
        this.PatientId = PatientId;
    }

    public String getPatientUser() {
        return PatientUser;
    }

    public void setPatientUser(String PatientUser) {
        this.PatientUser = PatientUser;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
}
