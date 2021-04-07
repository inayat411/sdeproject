package com.mycompany.realteamproject;

import com.covid.models.Patient;
import com.covid.models.PatientAccount;
import com.covid.models.Symptoms;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
        Symptoms fever = new Symptoms(1, "Fever", "Less Severe");
        Symptoms drycough = new Symptoms(8, "Dry Cough", "Less Severe");
        Symptoms tiredness = new Symptoms(3, "Tiredness", "Less Severe");
        Symptoms bodypain = new Symptoms(4, "Body Pain", "Less Severe");
        Symptoms throat = new Symptoms(11, "Sore Throat", "Less Severe");
        Symptoms diarrhoea = new Symptoms(9, "Diarrhoea", "Less Severe");
        Symptoms conjunctivitis = new Symptoms(12, "Conjunctivitis", "Less Severe");
        Symptoms headache = new Symptoms(2, "Headache", "Less Severe");
        Symptoms tastesmell = new Symptoms(6, "Loss of taste and smell", "Less Severe");
        Symptoms rash = new Symptoms(10, "Rash or discolouration of skin", "Less Severe");
        //Severe Symptoms
        Symptoms breathing = new Symptoms(5, "Difficulty of breathing", "Severe");
        Symptoms chestpain = new Symptoms(7, "Pain or pressure in chest", "Severe");
        Symptoms speechmov = new Symptoms(13, "Loss of speech or movement", "Severe");
                              
    /*public static void Covidcheck(int ){ 
            if(a >= 7 ){
            System.out.println("Please Visit your Doctor");
            }else{
                System.out.println("You have Coivd");
            }
        }*/
                                
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
        
        System.out.println(l);
        launch();
    }

}