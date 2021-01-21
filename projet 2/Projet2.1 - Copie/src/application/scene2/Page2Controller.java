package application.scene2;

import java.io.IOException;

import application.User;
import application.scene3.PageMonProfilController;
import application.scene4.PageAutreProfilController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Page2Controller {
	
    @FXML
    private BorderPane root2;

    private Parent mainView;
    
    @FXML private Text test;
    
    @FXML private Label label;
    

	@FXML
	private void monprofil() {
		loadPageMonProfil();
        
	}
	
    @FXML
    private void autreprofil() {
    	loadAutreProfil();    	
    }
    
    @FXML
    private void retour() {
    	loadMainView();    	
    }
    
    public void initialize() {
    	
    	
    }
    private void loadPageMonProfil() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "/application/scene3/pageMonProfil.fxml"));
	        Parent root = loader.load();
			
			PageMonProfilController pageMonProfilController = loader.getController();
			pageMonProfilController.setLabelText(label.getText());
			InfoProfilFields(pageMonProfilController);
	   
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();

        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    private void loadMainView() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "/application/scene1/connexion.fxml"));
            mainView = loader.load();
            root2.setCenter(mainView);

        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    private void InfoProfilFields(PageMonProfilController pageMonProfilController) {
    	User profil = bdd.profilDao.monProfil(label.getText());
    	pageMonProfilController.setNom(profil.getUserName());
		pageMonProfilController.setPrenom(profil.getUserPrenom());
		pageMonProfilController.setTelephone(profil.getUserTelephone());
		pageMonProfilController.setAdresse(profil.getUserAdresse());
		pageMonProfilController.setDiplome(profil.getUserDiplome());
		pageMonProfilController.setExpertise(profil.getUserExpertise());
		pageMonProfilController.setMail(profil.getUserMail());
		pageMonProfilController.setVille(profil.getUserVille());
		pageMonProfilController.setDisponibilite(profil.getUserDisponibilite());


    }


   public void setLabelText(String text){
       label.setText(text);
   }
   
   
   
   private void loadAutreProfil() {
       try {
           FXMLLoader loader = new FXMLLoader(getClass().getResource(
                   "/application/scene4/pageAutreProfil.fxml"));
	        Parent root = loader.load();
			
	        PageAutreProfilController pageAutreProfilController = loader.getController();
	        pageAutreProfilController.setLabelText(label.getText());
	   
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();

       } catch (IOException exc) {
           exc.printStackTrace();
       }
   }
      
           
}
