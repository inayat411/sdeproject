/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidfinal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ApppageController implements Initializable {

    ObservableList list = FXCollections.observableArrayList();

    @FXML
    private Button goback;
    @FXML
    private ChoiceBox<String> Series;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   loadData();     
// TODO
    }    

    @FXML
    private void butngoback(ActionEvent event) throws IOException {
                Parent homePage = FXMLLoader.load(getClass().getResource("home.fxml"));
       Scene homaepageScene = new Scene (homePage);
       Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(homaepageScene);
        appStage.show();
    }
    private void loadData(){
        list.remove(list);
        String a="Grocery";
        String b= "Hospital";
        list.addAll(a,b);
        Series.getItems().addAll(list);
        
        
        
    }
}
