package App;

import Interfaces.Destinataire;

public class Message {

	private String Texte;
	private Destinataire Destinaire;
	public String getTexte() {
		return Texte;
	}
	public void setTexte(String texte) {
		Texte = texte;
	}
	public Destinataire getDestinaire() {
		return Destinaire;
	}
	public void setDestinaire(Destinataire destinataire) {
		Destinaire = destinataire;
	}
	public Message() {
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
