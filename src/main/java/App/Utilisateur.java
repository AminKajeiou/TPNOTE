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
	
	public Utilisateur() {
		this.serveurs=new ArrayList<ServeurDiscussion>();
		this.prenom="Amin";
		this.nom="Kajeiou";
		this.login="AminK";
		this.motDePasse="test";
		this.mail="aminkajeiou7@gmail.com";
		
	}
	public Utilisateur(String prenom,String nom,String login,String mail) {
		this.serveurs=new ArrayList<ServeurDiscussion>();
		this.prenom=nom;
		this.nom=prenom;
		this.login=login;
		this.motDePasse="Test";
		this.mail=mail;
		
	}
	

	public String getLogin() {
		return login;
	}



}
