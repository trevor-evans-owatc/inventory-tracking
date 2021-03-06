package com.goliathnerd.inventorytracking;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FXMLController implements Initializable {
    
    /**
     * The addPartsAction activates when the add button is activated in the 
     * parts group. It takes the Action Event e as it's parameter. It then
     * builds a scene for the addPartForm and redirects to the 
     * addPartFormController.
     * @param e
     * @throws Exception 
     */
    @FXML
    private void addPartsAction(ActionEvent e) throws Exception{
        
        Parent addPartsRoot = FXMLLoader.load(getClass().getResource("/fxml/addPartForm.fxml"));
        
        Scene scene = new Scene(addPartsRoot);
        scene.getStylesheets().add("/styles/Styles.css");
        
        Stage addprtStage = (Stage)((Node)e.getSource()).getScene().getWindow();
        addprtStage.setTitle("Add Parts");
        addprtStage.setScene(scene);
        addprtStage.show();
    }
    
    /**
     * The addParductAction activates when the add button is activated in the 
     * product group. It takes the Action Event (e) as it's parameter. It then
     * builds a scene for the addProductForm and redirects to the 
     * addProductFormController.
     * 
     * RUNTIME ERROR: java.lang.ClassNotFoundException
     *  Corrected by passing the new stage as (Node)e.getSource).
     *  The exception was a result of trying to add a new scene without passing
     *  anything to it
     * @param e
     * @throws Exception 
     */
    @FXML
    private void addProductAction(ActionEvent e) throws Exception{
        
        Parent addProdRoot = FXMLLoader.load(getClass().getResource("/fxml/addProductForm.fxml"));
        
        Scene scene = new Scene(addProdRoot);
        scene.getStylesheets().add("/styles/Styles.css");
        
        Stage addprodStage = (Stage)((Node)e.getSource()).getScene().getWindow();
        addprodStage.setTitle("Add Product");
        addprodStage.setScene(scene);
        addprodStage.show();
    }
    
    /**
     * The modifyPartsAction activates when the modify button is activated in the 
     * parts group. It takes the Action Event (e) as it's parameter. It then
     * builds a scene for the modifyPartsForm and redirects to the 
     * modifyPartsFormController.
     * 
     * RUNTIME ERROR: java.lang.ClassNotFoundException
     *  Corrected by passing the new stage as (Node)e.getSource).
     *  The exception was a result of trying to add a new scene without passing
     *  anything to it
     * @param e
     * @throws Exception 
     */
    @FXML
    private void modifyPartsAction (ActionEvent e) throws Exception{
        Parent modPrtRoot = FXMLLoader.load(getClass().getResource("/fxml/modifyPart.fxml"));
        
        Scene modPrtScene = new Scene(modPrtRoot);
        modPrtScene.getStylesheets().add("/styles/Styles.css");
        
        Stage modPrtStage = (Stage)((Node)e.getSource()).getScene().getWindow();
        modPrtStage.setTitle("Add Product");
        modPrtStage.setScene(modPrtScene);
        modPrtStage.show();
    }
    
     /**
     * The modifyProductAction activates when the modify button is activated in the 
     * product group. It takes the Action Event (e) as it's parameter. It then
     * builds a scene for the modifyProductForm and redirects to the 
     * modifyProductFormController.
     * 
     * RUNTIME ERROR: java.lang.ClassNotFoundException
     *  Corrected by passing the new stage as (Node)e.getSource).
     *  The exception was a result of trying to add a new scene without passing
     *  anything to it
     * @param e
     * @throws Exception 
     */
    @FXML
    private void modifyProductAction(ActionEvent e) throws Exception{
        Parent modProdRoot = FXMLLoader.load(getClass().getResource("/fxml/modifyProductForm.fxml"));
        
        Scene modProdScene = new Scene(modProdRoot);
        modProdScene.getStylesheets().add("/styles/Styles.css");
        
        Stage modProdStage = (Stage)((Node)e.getSource()).getScene().getWindow();
        modProdStage.setTitle("Add Product");
        modProdStage.setScene(modProdScene);
        modProdStage.show();
    }
    
    //deleteButton removes the selected item from the table
    @FXML
    private void deleteButtonAction(ActionEvent e){}
    
    //The exitButtonAction event handler exits the program with 0 as
    // the argument.
    @FXML
    private void exitButtonAction(ActionEvent e){
        // The print statment is for debugging purposes
        // System.out.println("Exit pressed");
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
