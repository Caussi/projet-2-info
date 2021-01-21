package application.scene4;

import java.io.IOException;

import application.Entreprise;
import application.User;
import application.scene2.Page2Controller;
import application.scene3.PageMonProfilController;
import application.scene5.PageInfoAutreProfilController;
import application.scene6.PageInfoEntrepriseController;
import bdd.profilDao;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PageAutreProfilController {
	
    @FXML
    private BorderPane root;

    
    @FXML 
    private Label label;
    
    @FXML
    private TextField nom ;    
    @FXML
    private TextField prenom ;    
    @FXML
    private TextField entreprise ;
    
    @FXML
    private Label errorLabel ;
    @FXML
    private Label errorLabel2 ;
  
    @FXML
    private void retour() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "/application/scene2/page2.fxml"));
	        Parent root = loader.load();
			
			Page2Controller page2Controller = loader.getController();
			page2Controller.setLabelText(label.getText());
	   
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();

        } catch (IOException exc) {
            exc.printStackTrace();
        }    	
    }
    @FXML
    private void rechercheViaNom() {   
        if (profilDao.NomPrenomExiste(nom.getText(), prenom.getText())) {
        	LancerRechercheViaNom();
            errorLabel.setText("");
        } else {
            errorLabel.setText("Nom et/ou prénom invalide");
        }
    
    } 
    	


    private void LancerRechercheViaNom() {
    	try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "/application/scene5/pageInfoAutreProfil.fxml"));
	        Parent root = loader.load();
			
	        PageInfoAutreProfilController pageInfoAutreProfilController = loader.getController();
	        pageInfoAutreProfilController.setLabel1Text(nom.getText());
	        pageInfoAutreProfilController.setLabel1Text(prenom.getText());
			InfoProfilFields(pageInfoAutreProfilController);
	   
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();

        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    
  
    	
 
    

    private void InfoProfilFields(PageInfoAutreProfilController pageInfoAutreProfilController) {
    	User profil = bdd.profilDao.sonProfil(nom.getText(), prenom.getText());
    	pageInfoAutreProfilController.setInfosProfilText(" Nom : "+profil.getUserName()+"\n Prénom : "+profil.getUserPrenom()+"\n Téléphoné : "+profil.getUserTelephone()+"\n Mail : "+profil.getUserMail()+"\n Expertise : "+profil.getUserExpertise()+"\n Disponibilité : "+profil.getUserDisponibilite());
    }	

    
    @FXML
    private void rechercheViaEntreprise() {
        if (profilDao.EntrepriseExiste(entreprise.getText())){
        	LancerRechercheViaEntreprise();
            errorLabel2.setText("");
        } else {
            errorLabel2.setText("Nom de l'entreprise invalide");
        }
    
    }

    
    private void LancerRechercheViaEntreprise() {
    	try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/application/scene6/pageInfoEntreprise.fxml"));
        Parent root = loader.load();
		
        PageInfoEntrepriseController pageInfoEntrepriseController = loader.getController();
        pageInfoEntrepriseController.setLabel1Text(entreprise.getText());
		InfoEntrepriseFields(pageInfoEntrepriseController);
   
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();

    } catch (IOException exc) {
        exc.printStackTrace();
    }
}
    
    private void InfoEntrepriseFields(PageInfoEntrepriseController pageInfoEntrepriseController) {
    	Entreprise profil = bdd.profilDao.entreprise(entreprise.getText());
    	pageInfoEntrepriseController.setInfosEntrepriseText(" Nom : "+profil.getEntrepriseNom()+"\n Expertise demandée : "+profil.getEntrepriseExpertise()+"\n Disponibilité : "+profil.getEntrepriseDisponibilite()+"\n Nous conctacter : "+profil.getEntrepriseMail()+"\n Intervenants actuels : "+profil.getEntrepriseUserName()+" "+profil.getEntrepriseUserPrenom());
    }

    
    
    public void initialize() {

    }


	public void setLabelText(String text) {
		// TODO Auto-generated method stub
		label.setText(text);
	}



}
