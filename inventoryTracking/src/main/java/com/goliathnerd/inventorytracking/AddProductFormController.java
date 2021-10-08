package com.goliathnerd.inventorytracking;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author trevo
 */
public class AddProductFormController implements Initializable {

     /**
     * CancelbuttionAction redirects to the main screen (Scene.FXML)
     * It does not save any chances made in this form
     */
    @FXML
    private void cancelButtonAction (ActionEvent e) throws Exception{
        Parent mainRoot = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        
        Scene scene = new Scene(mainRoot);
        scene.getStylesheets().add("/styles/Styles.css");
        
        Stage addprtStage = (Stage)((Node)e.getSource()).getScene().getWindow();
        addprtStage.setTitle("Main Form");
        addprtStage.setScene(scene);
        addprtStage.show();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
