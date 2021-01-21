package application;

public class Entreprise {
	
	private String entrepriseNom;
	private String entrepriseDisponibilite;
	private String entrepriseExpertise;
	private String entrepriseMail;
	private String entrepriseUserName;
	private String entrepriseUserPrenom;

	public Entreprise(String entrepriseNom) {
		this.entrepriseNom = entrepriseNom;
	}

	public Entreprise(String entrepriseNom, String entrepriseDisponibilite, String entrepriseExpertise, String entrepriseUserName, String entrepriseUserPrenom, String entrepriseMail) {
		this.entrepriseNom = entrepriseNom;
		this.entrepriseDisponibilite = entrepriseDisponibilite;
		this.entrepriseExpertise = entrepriseExpertise;
		this.entrepriseUserName = entrepriseUserName;
		this.entrepriseUserPrenom = entrepriseUserPrenom;
		this.entrepriseMail = entrepriseMail;
	}
	
	
	public String getEntrepriseNom() {
		return entrepriseNom;
	}

	public void setEntrepriseNom(String entrepriseNom) {
		this.entrepriseNom = entrepriseNom;
	}

	public String getEntrepriseDisponibilite() {
		return entrepriseDisponibilite;
	}

	public void setEntrepriseDisponibilite(String entrepriseDisponibilite) {
		this.entrepriseDisponibilite = entrepriseDisponibilite;
	}

	public String getEntrepriseExpertise() {
		return entrepriseExpertise;
	}

	public void setEntrepriseExpertise(String entrepriseExpertise) {
		this.entrepriseExpertise = entrepriseExpertise;
	}

	public String getEntrepriseUserName() {
		return entrepriseUserName;
	}

	public void setEntrepriseUserName(String entrepriseUserName) {
		this.entrepriseUserName = entrepriseUserName;
	}

	public String getEntrepriseUserPrenom() {
		return entrepriseUserPrenom;
	}

	public void setEntrepriseUserPrenom(String entrepriseUserPrenom) {
		this.entrepriseUserPrenom = entrepriseUserPrenom;
	}

	public String getEntrepriseMail() {
		return entrepriseMail;
	}

	public void setEntrepriseMail(String entrepriseMail) {
		this.entrepriseMail = entrepriseMail;
	}
	
	
	
}
