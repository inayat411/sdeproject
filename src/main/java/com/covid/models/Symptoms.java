/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.covid.models;

import java.time.LocalDate;


/**
 *
 * @author samso
 */
public class Symptoms{
    
    private int Id;
    private String name;
    private String Severity;

    public Symptoms(int Id, String name, String Severity) {
        this.Id = Id;
        this.name = name;
        this.Severity = Severity;
    }

    public Symptoms() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    @Override
    public String toString() {
        return "Symptoms{" + "Id=" + Id + ", name=" + name + ", Severity=" + Severity + '}';
    }
 
}
    
