package transition;

import bdd.profilDao;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Connexion extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		
		// On titre la page
        primaryStage.setTitle("Page de connexion");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		// Message de garde
		Text scenetitle = new Text("Bienvenue");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);
		
		// Nom avant la case
		Label userName = new Label("Nom d'utilisateur :");
		grid.add(userName, 0, 1);

		final TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);
		
		// Nom avant la deuxième case
		Label pw = new Label("Mot de passe :");
		grid.add(pw, 0, 2);

		final PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);
		
		// Boutton de connexion
		Button btn = new Button("Connexion");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 1, 4);
		
		final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        // Réponse au boutton de connexion 
        // le but sera d'envoyer la page suivante si les
        // informations de connexion sontcorrectes
		btn.setOnAction(new EventHandler<ActionEvent>() {        	
            public void handle(ActionEvent e) {
    	        String nom = userTextField.getText();
    	        String mdp = pwBox.getText();
    	        Boolean valide = profilDao.MotDePasse(nom,mdp);
    	        if(valide==true) {
    	        	//changement de page
    	        	
    	        }
    	        else{
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Erreur");
    	        }
            }
        });
        
        Scene scene = new Scene(grid, 350, 275);
        primaryStage.setScene(scene);
        primaryStage.show();	
        }
}