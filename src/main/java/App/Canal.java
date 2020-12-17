package App;

import java.util.*;
import java.util.Map.Entry;

import Enums.Habilitation;
import Exception.ActionNonAutoriseeException;
import Interfaces.Destinataire;

public class Canal implements Comparable<Canal>,Destinataire{
	private HashMap<Role,List<Utilisateur>> mapping_role_utilisateurs;
	private static Integer ordre;
	private List<Webhook> webhooks;
	private String nom;
	private HashMap<Role,List<Habilitation>> mapping_role_habilitation;
	private List<Message> historiques;
	
	public Canal() {
		this.nom="Canal";
		this.webhooks=new ArrayList<Webhook>();
		this.historiques=new ArrayList<Message>();
		this.mapping_role_habilitation=new HashMap<Role,List<Habilitation>>();
		this.mapping_role_utilisateurs=new HashMap<Role,List<Utilisateur>>();
	}
	
	public HashMap<Role, List<Utilisateur>> getMapping_role_utilisateurs() {
		return mapping_role_utilisateurs;
	}

	public void setMapping_role_utilisateurs(HashMap<Role, List<Utilisateur>> mapping_role_utilisateurs) {
		this.mapping_role_utilisateurs = mapping_role_utilisateurs;
	}

	public HashMap<Role, List<Habilitation>> getMapping_role_habilitations() {
		return mapping_role_habilitation;
	}

	public List<Message> getHistoriques() {
		return historiques;
	}

	public void setMapping_role_habilitations(HashMap<Role, List<Habilitation>> mapping_role_habilitation) {
		this.mapping_role_habilitation = mapping_role_habilitation;
	}

	public void ecrireMessage(Utilisateur user,Message msg) throws ActionNonAutoriseeException {
		for(Entry<Role, List<Utilisateur>> m:this.mapping_role_utilisateurs.entrySet()) {
			if(m.getKey().getMonRole()=="Admin") {
				for(Utilisateur u:m.getValue()) {
					if(u.getLogin().equals(user.getLogin())) 		this.historiques.add(msg);
					else throw new ActionNonAutoriseeException();

				}
			}
		}
	}
	

	public int compareTo(Canal o) {
		// TODO Auto-generated method stub
		if(this.ordre!=o.getOrdre()) return 1;
		return 0;
	}

	public Integer getOrdre() {
		return ordre;
	}

}
