package fr.voxi.administration;

public interface Administrateur {
	public void utilisateur();
	public void membre();
	public void moderateur();
	public void bloquer(String Membre);
	public void debloquer(String Membre);

}
