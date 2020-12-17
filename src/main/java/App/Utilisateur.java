package App;

import java.util.*;

import Interfaces.Destinataire;

public class Utilisateur implements Destinataire {
	
	private List<ServeurDiscussion> serveurs;
	private String prenom;
	private String nom;
	private String login;
	private String motDePasse;
	private String mail;
	
	public Utilisateur(String prenom,String nom,String login,String mail) {
		this.serveurs=new ArrayList<ServeurDiscussion>();
		this.prenom=prenom;
		this.nom=nom;
		this.login=login;
		this.motDePasse="test";
		this.mail=mail;
		
	}

	public String getLogin() {
		return login;
	}



}
