package application;

public class User {
    
	private String userPrenom;
	private String userMail ;
	private String userTelephone;
	private String userAdresse;
	private String userVille ;
	private String userDiplome ;
	private String userExpertise ;
	private String userName ;
	private String userDisponibilite;
	
	public User(String userName) {
		this.userName = userName ;

	}
	
    
	public User(String userName, String userVille, String userAdresse, String userDiplome, String userExpertise, String userMail, String userTelephone, String userPrenom, String userDisponibilite) {
        
    	this.userAdresse = userAdresse;
		this.userDiplome = userDiplome;
		this.userExpertise = userExpertise;
		this.userMail = userMail;
		this.userPrenom = userPrenom;
		this.userTelephone = userTelephone;
		this.userVille = userVille;
		this.userName = userName ;
		this.userDisponibilite = userDisponibilite;
    }
    
	public void User1(String userName,String userPrenom){
		
		this.userPrenom = userPrenom;
		this.userName = userName ;

	}
			
    public String getUserName() {
        return userName ;
    }
    
    @Override
    public String toString() {
        return userName ;
    }
    
    public String getUserDisponibilite() {
    	return userDisponibilite;
    }
	public String getUserPrenom() {
		return userPrenom;
	}

	public String getUserTelephone() {
		return userTelephone;
	}

	public String getUserMail() {
		return userMail;
	}

	public String getUserAdresse() {
		return userAdresse;
	}

	public String getUserVille() {
		return userVille;
	}

	public String getUserDiplome() {
		return userDiplome;
	}

	public String getUserExpertise() {
		return userExpertise;
	}
	
	public void setUserDisponibilite(String userDisponibilite) {
		this.userDisponibilite = userDisponibilite;
	}

	public void setUserPrenom(String userPrenom) {
		this.userPrenom = userPrenom;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public void setUserTelephone(String userTelephone) {
		this.userTelephone = userTelephone;
	}

	public void setUserAdresse(String userAdresse) {
		this.userAdresse = userAdresse;
	}

	public void setUserVille(String userVille) {
		this.userVille = userVille;
	}

	public void setUserDiplome(String userDiplome) {
		this.userDiplome = userDiplome;
	}

	public void setUserExpertise(String userExpertise) {
		this.userExpertise = userExpertise;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
