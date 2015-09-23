package utilisateur;

public class Utilisateur {
private  String nom;
private String mail;

public Utilisateur(String nom, String mail) {
	super();
	this.nom = nom;
	this.mail = mail;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}

}
