package application.scene6;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class PageInfoEntrepriseController {
    
	@FXML
    private TextArea infosEntreprise ;  
	@FXML
	private Label label1;	

    public void initialize() {
       	
    }
    
    //nom
    public void setLabel1Text(String text){
        label1.setText(text);
    }    
    public void setInfosEntrepriseText(String text){
    	infosEntreprise.setText(text);
    }
}
