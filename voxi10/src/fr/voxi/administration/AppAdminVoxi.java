package fr.voxi.administration;
import java.util.ArrayList;
public class AppAdminVoxi {
	public static void main(String[] args) {
		ArrayList<Utilisateur>utilisateurs=new ArrayList<Utilisateur>();
		utilisateurs.add(new Membre ("ZAKI","Selma","s.zaki@gns.fr","azerty",2,false));
		utilisateurs.add(new Moderateur ("LEBREON","Jules","j.lebreton@gmail.com","azerty",2,"jbreton",33));
		utilisateurs.add(new Moderateur ("BA","Béchir","bechir.ba@gmail","azerty",1,"bba",103));
		utilisateurs.add(new Membre ("CAMOIT","Alexis","a.camoit@gns.fr","azerty",2,true));
		utilisateurs.add(new Membre ("KARIM","Lamia","l.karim@gns.fr","azerty",1,false));
		utilisateurs.add(new Moderateur ("ESSAMAMI","Hamza","hamza.mami@free.fr","azerty",2,"hessa",8));

	for( int i = 0; i < utilisateurs.size() ; i++ ) {

		System.out.println(utilisateurs.get(i).getNom()+" "+utilisateurs.get(i).getPrenom());		
	}
	int jour = 0 ;
	for( int i = 0; i < utilisateurs.size() ; i++ ) {
		if(utilisateurs.get(i).getEtat()==1) {
			jour = jour +1;
		}
	}
	System.out.println("Nombre d'utilisateur connecté : " + jour);
	
	for( int i = 0; i < utilisateurs.size() ; i++ ) { //4
		utilisateurs.get(i).setEtat(2);
		System.out.println(" "+ utilisateurs.get(i).getNom() + " " + utilisateurs.get(i).getEtat());
	
	}

		
	if( ( ( Membre ) ( utilisateurs.get( 0 ) ) ).seConnecter( "jberto" , "azerty") == true ) { //5
		System.out.println("Vous ête connecté");
	}
	else {
		System.out.println("Échec de l'authentification qst5");
	}
	
	if( ( ( Membre ) ( utilisateurs.get( 0 ) ) ).seConnecter( "s.zaki@gns.fr" , "azerty") == true ) { //6
		System.out.println("Vous ête connecté qst 6");
	}
	else {
		System.out.println("Échec de l'authentification");
	}
	
	for( int i = 0; i < utilisateurs.size() ; i++ ) { //qst7
		if(  utilisateurs.get( i ) instanceof Membre)  { 
			
			if(utilisateurs.get(i).seConnecter(utilisateurs.get(i).getEmail(),utilisateurs.get(i).getMdp())){
				System.out.println("Vous êtes connecté qst7");				
			}
			else {
				System.out.println("Vous avez pas reussi a vous connecté");

			}
		}
		else {
			if (utilisateurs.get(i).seConnecter(((Moderateur)(utilisateurs.get(i))).getLogin(),utilisateurs.get(i).getMdp())==true) {
				System.out.println("Vous êtes connecter en tant que moderateur qst7");
			}
			else {
				System.out.println("vous avez pas reussi a vous connecter");
			}
		}
	}

	Moderateur mo = ((Moderateur) (utilisateurs.get(1)));//8
	Membre me = ((Membre)(utilisateurs.get(3)));
	mo.debloquer(me);
	System.out.println(utilisateurs.get(3).getNom()+ " Vous n'êtes plus bloquer qst8");
	
	if( ( ( Membre ) ( utilisateurs.get( 3 ) ) ).seConnecter( "a.camoit@gns.fr" , "azerty") == true ) { //8
		System.out.println("Vous êtes connecté en tant que CAMOIT Alexis qst 8");
	}
	
	
	Moderateur ma = ((Moderateur) (utilisateurs.get(5)));//9
	
	Membre mi = ((Membre)(utilisateurs.get(0)));
	
	ma.bloquer(mi);

	System.out.println(utilisateurs.get(0).getNom()+ " Vous êtes bloquer qst9");
	
	

	if( ( ( Membre ) ( utilisateurs.get( 0 ) ) ).isBloque()==true ) { //9
		
		System.out.println("Vous ne pouvez pas vous connecter qst 9");

	}
	else {
		
		if( ( ( Membre ) ( utilisateurs.get( 0 ) ) ).seConnecter( "s.zaki@gns.fr" , "azerty") == true ) {//9
			
			System.out.println("Vous ête connecté qst 9");
		} 
		
		else {
			
			System.out.println("Vous identifiant ne sont pas bon qst 9");

		}
	}
	
	Moderateur moderateur =(Moderateur) (utilisateurs.get(2));

	Membre membre=(Membre) (utilisateurs.get(4));

	System.out.println(moderateur.alerter(moderateur,membre,""));


	
	
	}
}
