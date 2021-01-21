package application.scene3;

import java.io.IOException;

import application.User;
import application.scene2.Page2Controller;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PageMonProfilController {
	
	@FXML
	private Label label;

	@FXML
    private BorderPane root;

   
    @FXML
    private TextField nom ;    
    @FXML
    private TextField prenom ;    
    @FXML
    private TextField mail ;    
    @FXML
    private TextField telephone ;    
    @FXML
    private TextField adresse ;    
    @FXML
    private TextField ville ;    
    @FXML
    private TextField diplome ;
    @FXML
    private TextField expertise ;
    @FXML
    private TextField disponibilite;
    
    @FXML
    private void modifier() {
    	User newprofil = new User(nom.getText(), ville.getText(), adresse.getText(),  diplome.getText(), expertise.getText(), mail.getText(), telephone.getText(), prenom.getText(), disponibilite.getText());
    	bdd.profilDao.modifierProfil(newprofil, label);
    	}
    @FXML
    private void modifierMdp() {
    	User newprofil = new User(nom.getText(), ville.getText(), adresse.getText(),  diplome.getText(), expertise.getText(), mail.getText(), telephone.getText(), prenom.getText(), disponibilite.getText());
    	bdd.profilDao.modifierProfil(newprofil, label);
    	}
    @FXML
    private void retour() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "/application/scene2/page2.fxml"));
	        Parent root = loader.load();
			
			Page2Controller page2Controller = loader.getController();
			page2Controller.setLabelText(nom.getText());
	   
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();

        } catch (IOException exc) {
            exc.printStackTrace();
        }    	
    }
    
    public void initialize() {
    }
    
    
   

	public void setLabelText(String text) {
		// TODO Auto-generated method stub
		label.setText(text);
	}

	public void setNom(String text) {
		// TODO Auto-generated method stub
		nom.setText(text);
	}	
	public void setPrenom(String text) {
		// TODO Auto-generated method stub
		prenom.setText(text);
	}
	public void setMail(String text) {
		// TODO Auto-generated method stub
		mail.setText(text);
	}
	public void setVille(String text) {
		// TODO Auto-generated method stub
		ville.setText(text);
	}
	public void setAdresse(String text) {
		// TODO Auto-generated method stub
		adresse.setText(text);
	}
	public void setDiplome(String text) {
		// TODO Auto-generated method stub
		diplome.setText(text);
	}
	public void setExpertise(String text) {
		// TODO Auto-generated method stub
		expertise.setText(text);
	}
	public void setTelephone(String text) {
		// TODO Auto-generated method stub
		telephone.setText(text);
	}
	public void setDisponibilite(String text) {
		// TODO Auto-generated method stub
		disponibilite.setText(text);
	}


	   

	public void getNom(String text) {
		// TODO Auto-generated method stub
		nom.getText();
	}	
	public void getPrenom(String text) {
		// TODO Auto-generated method stub
		prenom.getText();
	}
	public void getMail(String text) {
		// TODO Auto-generated method stub
		mail.getText();
	}
	public void getVille(String text) {
		// TODO Auto-generated method stub
		ville.getText();
	}
	public void getAdresse(String text) {
		// TODO Auto-generated method stub
		adresse.getText();
	}
	public void getDiplome(String text) {
		// TODO Auto-generated method stub
		diplome.getText();
	}
	public void getExpertise(String text) {
		// TODO Auto-generated method stub
		expertise.getText();
	}
	public void getTelephone(String text) {
		// TODO Auto-generated method stub
		telephone.getText();
	}



  
}
