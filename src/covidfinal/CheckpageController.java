package covidfinal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CheckpageController implements Initializable {
    
    ObservableList list = FXCollections.observableArrayList();

    //<editor-fold defaultstate="collapsed" desc="Variables">
    @FXML
    private AnchorPane Anchorpane;
    
    @FXML
    private AnchorPane Anchor;

    @FXML
    private Label detailslbl;

    @FXML
    private Label plabel;

    @FXML
    private Label symplbl;

    @FXML
    private Button verifybtn;

    @FXML
    private TextField agelabel;

    @FXML
    private TextField phonelabel;

    @FXML
    private CheckBox feverbtn;

    @FXML
    private CheckBox drybtn;

    @FXML
    private CheckBox tiredbtn;

    @FXML
    private CheckBox Achesbtn;
    
    @FXML
    private CheckBox losssbtn;

    @FXML
    private CheckBox sorebtn;

    @FXML
    private CheckBox conbtn;

    @FXML
    private CheckBox headbtn;

    @FXML
    private CheckBox lossbtn;

    @FXML
    private CheckBox rashbtn;

    @FXML
    private CheckBox diffbtn;

    @FXML
    private CheckBox chestpainbtn;

    @FXML
    private CheckBox slightbtn;

    @FXML
    private CheckBox diabtn;

    @FXML
    private Button rtrnbtn;
    
    @FXML
    private Button confirmbtn;
    
    @FXML
    private Label resultbtn;

    @FXML
    private ChoiceBox<String>genderbox;
    
    @FXML
    private Label alert;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    loadGenderData();     
    }  
    
    //<editor-fold defaultstate="collapsed" desc="Methods">
    void loadGenderData(){
        list.remove(list);
        String a="Male";
        String b= "Female";
        list.addAll(a,b);
        genderbox.getItems().addAll(list);
    }
    
    private void goback(ActionEvent event) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("home.fxml"));
        Scene homaepageScene = new Scene (homePage);
        Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(homaepageScene);
        appStage.show();
    }
    //</editor-fold>
    
    
    @FXML
    private void returnbuttonpressed(ActionEvent event) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("home.fxml"));
       Scene homaepageScene = new Scene (homePage);
       Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(homaepageScene);
        appStage.show();
    }
    
    
    @FXML void verifybuttonpressed(){
        String Symptoms = "Your Symptoms are: ";
        
        if(diffbtn.isSelected())
            Symptoms += "\nDifficulty Breathing";
        
        if(feverbtn.isSelected())
            Symptoms += "\nFever";
        
        if(sorebtn.isSelected())
            Symptoms += "\nSore throat";
        
        if(drybtn.isSelected())
            Symptoms += "\nDry Cough";
        
        if(tiredbtn.isSelected())
            Symptoms += "\nTiredness";
        
        if(chestpainbtn.isSelected())
            Symptoms += "\nChest pain or Pressure";
        
        if(slightbtn.isSelected())
            Symptoms += "\nSlight BOdy Pain or Mild Headache";
        
        if(diabtn.isSelected())
            Symptoms += "\nDiarrhoea";
        
        if(lossbtn.isSelected())
            Symptoms += "\nLoss of Speech or Movement";
        
        if(headbtn.isSelected())
            Symptoms += "\nHeadache";
        
        if(conbtn.isSelected())
            Symptoms += "\nConjuctivitis";
        
        if(Achesbtn.isSelected())
            Symptoms += "\nAches and Pains";
        
        if(rashbtn.isSelected())
            Symptoms += "\nRash or Discoloration";
        
        if(losssbtn.isSelected())
            Symptoms += "\nLoss of taste or smell";
        
        
        System.out.println("Verify Button Clicked");
       
        this.resultbtn.setText(Symptoms);
    }
    
    @FXML
    void confirmbuttonpressed(ActionEvent event) throws IOException{
        int count = 0;
        
        if(diffbtn.isSelected())
            count = count + 1;
        
        if(feverbtn.isSelected())
            count = count + 1;
        
        if(sorebtn.isSelected())
            count = count + 1;
        
        if(drybtn.isSelected())
            count = count + 1;
        
        if(tiredbtn.isSelected())
            count = count + 1;
        
        if(chestpainbtn.isSelected())
            count = count + 1;
        
        if(slightbtn.isSelected())
            count = count + 1;
        
        if(diabtn.isSelected())
            count = count + 1;
        
        if(lossbtn.isSelected())
            count = count + 1;
        
        if(headbtn.isSelected())
            count = count + 1;
        
        if(conbtn.isSelected())
            count = count + 1;
        
        if(Achesbtn.isSelected())
            count = count + 1;
        
        if(rashbtn.isSelected())
            count = count + 1;
        
        if(losssbtn.isSelected())
            count = count + 1;
        
        if(count>=7 || (Achesbtn.isSelected() && conbtn.isSelected() && chestpainbtn.isSelected() && feverbtn.isSelected())){
           this.resultbtn.setText("You may have SarscOV19 Virus");
        }else{
            this.resultbtn.setText("\nConsult your doctor, \nyou do not have any serious Symptoms");
        }
    }

}


