package application.scene5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class PageInfoAutreProfilController {
	
    @FXML
    private TextArea infosProfil ;  
	@FXML
	private Label label1;	
	@FXML
	private Label label2;
    
    public void initialize() {
       	
    }


    //nom
    public void setLabel1Text(String text){
        label1.setText(text);
    }
    //prénom
    public void setLabel2Text(String text){
        label2.setText(text);
    }

    public void setInfosProfilText(String text){
    	infosProfil.setText(text);
    }
	

}
