package application.scene1;

import java.io.IOException;

import application.scene2.Page2Controller;
import bdd.profilDao;
import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ConnexionController  {
    
	@FXML
    private BorderPane root;
	
    @FXML
    private TextField userNameField ;
    @FXML
    private PasswordField passwordField ;
    
    @FXML
    private Label errorLabel ;
    
    @FXML
    private void connexion() {
    	String nom = userNameField.getText();
        String mdp = passwordField.getText();
        if (profilDao.MotDePasse(nom, mdp)) {
        	keepUserName();
            errorLabel.setText("");
        } else {
            errorLabel.setText("Erreur de connexion");
        }
        clearFields();
    }
    
    @FXML
    private void annuler() {
        clearFields();
        errorLabel.setText("");
    }

	
	
    private void keepUserName() {
    	// Module qui envoie une donnée vers une nouvelle scene
    	try {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/scene2/page2.fxml"));
	        Parent root = loader.load();
			
			Page2Controller page2Controller = loader.getController();
			page2Controller.setLabelText(userNameField.getText());
	   
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    private void clearFields() {
        userNameField.setText("");
        passwordField.setText("");
    }
}
