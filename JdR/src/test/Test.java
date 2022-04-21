package test;

import java.util.List;
import java.util.Scanner;

import model.Admin;
import model.Compte;
import model.Consommables;
import model.Joueur;
import model.Personnage;
import model.Stuff;

public class Test {

public static String saisieString(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg+"\n");
		return sc.nextLine();
	}

public static int saisieInt(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg+"\n");
		return sc.nextInt();
	}

public static double saisieDouble(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg+"\n");
		return sc.nextDouble();
	}

public static boolean saisieBoolean(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg+"\n");
		return sc.nextBoolean();
	}


//TOUS LES MENUS DISPONIBLES SELON LES IDENTIFIANTS

private static void menuJoueur() 
	{
		System.out.println("Menu Principal");
		System.out.println("1- Démarrer une partie");
		System.out.println("2- Reprendre une partie");
		System.out.println("3- Ecraser une partie");
		System.out.println("4- Crédits");
		System.out.println("5- Quitter");
		int choix = saisieInt("Choix du menu");
		
		switch(choix) 
		{
		case 1 : creationPartie();break;
		case 2 : reprendrePartie();break;
		case 3 : supprimerPartie();break;
		case 4 : credits();break;
		case 5: System.exit(0);break;
		}
		menuJoueur();
	}

private static void menuAdmin() 
	{
		System.out.println("Bien-le-bonjour, Maître du Jeu");
		System.out.println("1- Gestion de la boutique");
		System.out.println("2- Gestion des personnages");
		System.out.println("3- Quitter");
		int choix = saisieInt("Choix du menu");
		
		switch(choix) 
		{
		case 1 : gestionBoutique();break;
		case 2 : gestionPerso();break;
		case 3 : System.exit(0);break;
		}
		menuAdmin();




	}
private static void creationPartie() 
	{
		System.out.println("Création d'une partie");
		System.out.println("1- Créer un personnage");
		System.out.println("2- Importer un personnage existant");
		System.out.println("3- Retour");
		int choix = saisieInt("Choix du menu");
		
		switch(choix) 
		{
		case 1 : creationPersonnage();break;
		case 2 : importPersonnage();break;
		case 3 : menuJoueur();break;
		}
		creationPartie();
	}

private static void reprendrePartie(){
	
	//Deserialisation, faite lorsque l'on sauvegarde notre partie'
}

private static void supprimerPartie(){
	afficherPersonnages();
		int id = saisieInt("Êtes-vous sur de vouloir écraser cette partie ? Tous les personnages affiché ci-dessus seront supprimés");
		personnages.clear();
		menuConnexion();
}

private static void afficherPersonnages(){
	List<Partie> personnages = daoPartie.findAll();	//Dans la liste, il doit y avoir tous les personnagescrée au cours de la partie 
	
	
}
private static void credits(){
	
	System.out.println("blablabla");
}




private static void creationPersonnage(){
	System.out.println("Création d'un personnage' : ");
	
	Personnage j1 = new Personnage(gold, pv, niveau, nom, prenom, age, genre, alignement, race, metier, stats, competences);
	
}

private static void importPersonnage(){
	
}


private static void gestionBoutique(){
	 Stuff i=null;
        String libelle = saisieString("Nom de l'objet à ajouter' ?");
        String typeObject=saisieString("Type objet ? Consommables/Armes");

        switch(typeObject){
        case"Consommables" : String description = saisieString("Description de l'objet?"); i = new Consommables(libelle,description);break;
        case"Armes" : int Soin =saisieInt("	boost?");
        }
        
     daoStuff.insert(i);

	
	
	
	
	
	
	
	
}

private static void gestionPerso(){
	
}








//MENU DE BASE 

private static void menuConnexion() {

		String login= saisieString("Saisir votre login");
		String password=saisieString("Saisir votre password");

		Compte c = daoCompte.seConnecter(login,password);//UNIQUEMENT SI ON FAIT UN DAO (JDBC) et non JPA 

		if(c instanceof Admin) 
		{
			menuAdmin();
		}
		else if(c instanceof Joueur) 
		{
			menuJoueur();
		}
		else 
		{
			System.out.println("Identifiants invalides");
		}
		menuConnexion();
	}




















}
