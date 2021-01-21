package bdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import application.Entreprise;
import application.User;
import javafx.scene.control.Label;

public class profilDao {


	private static String url="jdbc:mysql://localhost:3306/projet_2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static String login="root";
	private static String password="root"; //password="root"
	
	private static Connection cn = null;
	private static Statement st = null;

	public profilDao() throws ClassNotFoundException, SQLException {
		cn= DriverManager.getConnection(url, login, password);
	}


	public static boolean MotDePasse(String nom, String mdp) {
	Boolean valide = null;
	try {
		cn= DriverManager.getConnection(url, login, password);
		st=cn.createStatement();
		
		ResultSet res=st.executeQuery("Select 1 from profil where profil.nom like '"+nom+"' and profil.mdp like '"+mdp+"'");		
		valide = res.first();
		cn.close();		
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}	
	return valide;
	
	}
	public static boolean NomPrenomExiste(String nom, String prenom) {
	Boolean valide = null;
	try {
		cn= DriverManager.getConnection(url, login, password);
		st=cn.createStatement();
		
		ResultSet res=st.executeQuery("Select 1 from profil where profil.nom like '"+nom+"' and profil.prenom like '"+prenom+"'");		
		valide = res.first();
		cn.close();		
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}	
	return valide;
	
	}
	public static boolean EntrepriseExiste(String entreprise) {
	Boolean valide = null;
	try {
		cn= DriverManager.getConnection(url, login, password);
		st=cn.createStatement();
		
		ResultSet res=st.executeQuery("Select 1 from entreprise where entreprise.nom like '"+entreprise+"'");		
		valide = res.first();
		cn.close();		
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}	
	return valide;
	
	}


	public static User monProfil(String nom) {
	User utilisateur = new User(nom);
	try {
		cn= DriverManager.getConnection(url, login, password);
		st=cn.createStatement();
		ResultSet res=st.executeQuery("Select * from profil where profil.nom like '"+nom+"'");
		while(res.next()) {
			utilisateur.setUserName(res.getString("nom"));
			utilisateur.setUserPrenom(res.getString("prenom"));
			utilisateur.setUserTelephone(res.getString("telephone"));
			utilisateur.setUserDiplome(res.getString("diplome"));
			utilisateur.setUserMail(res.getString("mail"));
			utilisateur.setUserExpertise(res.getString("expertise"));
			utilisateur.setUserAdresse(res.getString("adresse"));
			utilisateur.setUserVille(res.getString("ville"));
			utilisateur.setUserDisponibilite(res.getString("disponibilite"));

					
		}
		cn.close();	
		}
	catch (Exception e) {
		e.printStackTrace();
		
	}
	
	
	return utilisateur;
	}
	
	public static void modifierProfil(User newprofil, Label nom) {
		try {
			cn= DriverManager.getConnection(url, login, password);
			st=cn.createStatement();
					st.executeUpdate("UPDATE profil SET nom = '"+newprofil.getUserName()+"', prenom = '"+newprofil.getUserPrenom()+"',"
					+ "telephone = '"+newprofil.getUserTelephone()+"', adresse = '"+newprofil.getUserAdresse()+"', ville = '"+newprofil.getUserVille()+"'"
					+ ", diplome = '"+newprofil.getUserDiplome()+"', expertise = '"+newprofil.getUserExpertise()+"', disponibilite = '"+newprofil.getUserDisponibilite()+"',"
					+ " mail = '"+newprofil.getUserMail()+"' WHERE profil.nom like '"+nom.getText()+"'");
			cn.close();	
			}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	
	public static boolean NomPrenom(String nom, String prenom) {
	Boolean valide = null;
	try {
		cn= DriverManager.getConnection(url, login, password);
		st=cn.createStatement();
		
		ResultSet res=st.executeQuery("Select 1 from profil where profil.nom like '"+nom+"' and profil.prenom like '"+prenom+"'");		
		valide = res.first();
		cn.close();		
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}	
	return valide;
	
	}
	
	public static User sonProfil(String nom, String prenom) {
	User utilisateur = new User(nom);
	try {
		cn= DriverManager.getConnection(url, login, password);
		st=cn.createStatement();
		ResultSet res=st.executeQuery("Select * from profil where profil.nom like '"+nom+"'and profil.prenom like '"+prenom+"'");
		while(res.next()) {
			utilisateur.setUserName(res.getString("nom"));
			utilisateur.setUserPrenom(res.getString("prenom"));
			utilisateur.setUserTelephone(res.getString("telephone"));
			utilisateur.setUserDiplome(res.getString("diplome"));
			utilisateur.setUserMail(res.getString("mail"));
			utilisateur.setUserExpertise(res.getString("expertise"));
			utilisateur.setUserAdresse(res.getString("adresse"));
			utilisateur.setUserVille(res.getString("ville"));
			utilisateur.setUserDisponibilite(res.getString("disponibilite"));

					
		}
		cn.close();	
		}
	catch (Exception e) {
		e.printStackTrace();
		
	}
	return utilisateur;
	}
	
	public static Entreprise entreprise(String nomEntreprise) {
		Entreprise profilEntreprise = new Entreprise(nomEntreprise);
		try {
			cn= DriverManager.getConnection(url, login, password);
			st=cn.createStatement();
			ResultSet res=st.executeQuery("Select entreprise.nom, entreprise.expertise, entreprise.disponibilite, entreprise.mail, profil.nom, profil.prenom FROM entreprise INNER JOIN profil ON entreprise.idprofil = profil.id WHERE entreprise.nom like '"+nomEntreprise+"'");			
			while(res.next()) {
				profilEntreprise.setEntrepriseNom(res.getString("nom"));
				profilEntreprise.setEntrepriseExpertise(res.getString("expertise"));
				profilEntreprise.setEntrepriseDisponibilite(res.getString("disponibilite"));
				profilEntreprise.setEntrepriseUserName(res.getString("profil.nom"));
				profilEntreprise.setEntrepriseUserPrenom(res.getString("profil.prenom"));
				profilEntreprise.setEntrepriseMail(res.getString("mail"));
			}
			cn.close();	
			}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return profilEntreprise;
		}
	
	
	
	
	
	
}
	
