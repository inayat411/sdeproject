package com.mycompany.realteamproject;

import com.covid.models.Patient;
import com.covid.models.PatientAccount;
import com.covid.models.Symptoms;
import java.time.LocalDate;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
 
        var label = new Label("Hello, JavaFX "  + ", running on Java " +  ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //Symptoms
        Symptoms fever = new Symptoms("Sars1", "Fever", "Less Severe");
        Symptoms drycough = new Symptoms("Sars2", "Dry Cough", "Less Severe");
        Symptoms tiredness = new Symptoms("Sars3", "Tiredness", "Less Severe");
        Symptoms bodypain = new Symptoms("Sars4", "Body Pain", "Less Severe");
        Symptoms throat = new Symptoms("Sars5", "Sore Throat", "Less Severe");
        Symptoms diarrhoea = new Symptoms("Sars6", "Diarrhoea", "Less Severe");
        Symptoms conjunctivitis = new Symptoms("Sars7", "Conjunctivitis", "Less Severe");
        Symptoms headache = new Symptoms("Sars8", "Headache", "Less Severe");
        Symptoms tastesmell = new Symptoms("Sars9", "Loss of taste and smell", "Less Severe");
        Symptoms rash = new Symptoms("Sars10", "Rash or discolouration of skin", "Less Severe");
        
        Symptoms breathing = new Symptoms("Sars11", "Difficulty of breathing", "Severe");
        Symptoms chestpain = new Symptoms("Sars12", "Pain or pressure in chest", "Severe");
        Symptoms speechmov = new Symptoms("Sars13", "Loss of speech or movement", "Severe");
                                
        //Patients
        Patient p1 = new Patient("Richard", "01A75Q", LocalDate.of(1965, 5, 21), "Male", "richard@gmail.com");
        Patient p2 = new Patient("Anna", "54GR91", LocalDate.of(1988, 12, 10), "Female", "anna@gmail.com");
        Patient p3 = new Patient("Bob", "5763DS", LocalDate.of(1996, 8, 31), "Male", "bob@gmail.com");
        Patient p4 = new Patient("Kate", "5463AD", LocalDate.of(1992, 9, 30), "Female", "kate@gmail.com");
        Patient p5 = new Patient("David", "BT5J87", LocalDate.of(1950, 4, 25), "Male", "david@gmail.com");
        
        //patient account
        PatientAccount PA1 = new PatientAccount("", "Richard", "Rich1");
        PatientAccount PA2 = new PatientAccount("", "Anna", "London4578");
        PatientAccount PA3 = new PatientAccount("", "Bob", "BluePen54356");
        PatientAccount PA4 = new PatientAccount("", "Kate", "PaSsWoRd656");
        PatientAccount PA5 = new PatientAccount("", "David", "Davidpassword5458");
        
        System.out.println("Today is a good day");
        launch();
    }

}