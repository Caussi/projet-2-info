package transition;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Choix extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		
		// On titre la page
        primaryStage.setTitle("Choix");
		final GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		// Message de garde
		Text scenetitle = new Text("Choisissez un action");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		// Boutton de connexion
		Button btn1 = new Button("Choix 1");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_LEFT);
		hbBtn.getChildren().add(btn1);
		grid.add(hbBtn, 1, 4);
		

            
        Button btn2 = new Button("Choix 2");
        HBox hbBtn2 = new HBox(10);
    	hbBtn2.setAlignment(Pos.BOTTOM_RIGHT);
    	hbBtn2.getChildren().add(btn2);
    	grid.add(hbBtn2, 2, 4);
		
    	
    	//Texte affichage


        btn1.setOnAction(new EventHandler<ActionEvent>() {
       	 
            public void handle(ActionEvent a) {
            	final Text actiontarget = new Text();
                grid.add(actiontarget, 1, 6);
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("boutton 1 appuyé");
            }
        });
 

        // le but sera d'envoyer la page suivante 
        btn2.setOnAction(new EventHandler<ActionEvent>() {
        	 
            public void handle(ActionEvent a) {
            	final Text actiontarget = new Text();
                grid.add(actiontarget, 2, 6);
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("boutton 2 appuyé");
            }
        });
        
        Scene scene = new Scene(grid, 350, 275);
        primaryStage.setScene(scene);
        primaryStage.show();	
        }
}