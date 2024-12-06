package fr.voxi.administration;

public class Moderateur extends Utilisateur{
	private String login;
	private int nbAlertesEnvoyees= 0 ;
	
	public Moderateur(String nom, String prenom, String email, String mdp, int etat, String login,
			int nbAlertesEnvoyees) {
		super(nom, prenom, email, mdp, etat);
		this.login = login;
		this.nbAlertesEnvoyees = nbAlertesEnvoyees;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getNbAlertesEnvoyees() {
		return nbAlertesEnvoyees;
	}
	public void setNbAlertesEnvoyees(int nbAlertesEnvoyees) {
		this.nbAlertesEnvoyees = nbAlertesEnvoyees;
	}
	@Override
	public String toString() {
		return "moderateur [login=" + login + ", nbAlertesEnvoyees=" + nbAlertesEnvoyees + ", getLogin()=" + getLogin()
				+ ", getNbAlertesEnvoyees()=" + getNbAlertesEnvoyees() + ", getNom()=" + getNom() + ", getPrenom()="
				+ getPrenom() + ", getEmail()=" + getEmail() + ", getMdp()=" + getMdp() + ", getEtat()=" + getEtat()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	public boolean seConnecter(String login, String mdp) {
		if(login==this.getLogin() && mdp==this.getMdp()) {
			return true;
		}
		else {
			return false;
		}
	}
	public String seDeconnecter() {
		return "Vous êtes déconnecté";
	}
	
	public boolean bloquer( Membre membre) {
		membre.setBloque(true);
		return true;
	}
	public boolean debloquer(Membre membre ) {
		membre.setBloque(false);
		return false;
	}
	
	public String alerter(Moderateur mod, Membre joueur,String Message) {

		nbAlertesEnvoyees = nbAlertesEnvoyees+1;

		joueur.visuNotif(Message);
		return  joueur.getNom()+" "+ joueur.getPrenom() + " Vous avez recu une alerte par " + mod.getNom() +" "+ mod.getPrenom()+ " : " + Message;
	}

	}

	
	
	

