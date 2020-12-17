package App;

import java.util.*;

public class ServeurDiscussion {
	private String nom;
	private List<Canal> canaux;
	private HashMap<Role,List<Habilitation>> mapping_role_habilitation;
	private HashMap<Role,List<Utilisateur>> mapping_role_utilisateurs;
	
	public ServeurDiscussion(String nom) {
		this.nom=nom;
		this.canaux=new ArrayList<Canal>();
		this.mapping_role_habilitation=new HashMap<Role,List<Habilitation>>();
		this.mapping_role_utilisateurs=new HashMap<Role,List<Utilisateur>>();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
