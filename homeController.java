/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidfinal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class homeController implements Initializable {

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
//this part chnages the scene to appointmnt when clicked on the app button *//
    @FXML
    private void goToapp(ActionEvent event) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("apppage.fxml"));
       Scene homaepageScene = new Scene (homePage);
       Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(homaepageScene);
        appStage.show();
       
       
    }
//this part chnages the scene to appointmnt when clicked on the app button *//
    @FXML
    private void goToCheck(ActionEvent event) throws IOException {
           Parent homePage = FXMLLoader.load(getClass().getResource("checkpage.fxml"));
       Scene homaepageScene = new Scene (homePage);
       Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(homaepageScene);
        appStage.show();
    }
    
}
