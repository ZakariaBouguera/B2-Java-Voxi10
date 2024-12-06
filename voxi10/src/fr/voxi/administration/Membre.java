package fr.voxi.administration;

public class Membre extends Utilisateur{
	private boolean bloque =false;

	public Membre(String nom, String prenom, String email, String mdp, int etat, boolean bloque) {
		super(nom, prenom, email, mdp, etat);
		this.bloque = bloque;
	}

	public boolean isBloque() {
		return bloque;
	}

	public void setBloque(boolean bloque) {
		this.bloque = bloque;
	}

	@Override
	public String toString() {
		return "membre [bloque=" + bloque + ", isBloque()=" + isBloque() + ", getNom()=" + getNom() + ", getPrenom()="
				+ getPrenom() + ", getEmail()=" + getEmail() + ", getMdp()=" + getMdp() + ", getEtat()=" + getEtat()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	public boolean seConnecter(String email, String mdp) {
		if(email==this.getEmail() && mdp==this.getMdp()) {
			return true;
		}
		else {
			return false;
		}
	}
	public String seDeconnecter() {
		return "Vous êtes déconnecté";
	}
	
	public String visuNotif(String notif) {
		return "Vos notifs : " + notif;		
	}



}
