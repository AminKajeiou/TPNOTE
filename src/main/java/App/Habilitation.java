package App;

import Interfaces.Destinataire;

public class Habilitation implements Comparable<Habilitation>{

	private static final int LECTURE=0;
	private static final int ECRITURE=0;
	private static final int MODIFICATION=0;
	private static final int SUPRESSION=0;
	private static final int DROIT_INVITATION=0;
	
	public String[] values() {
		String[] vals={String.valueOf(LECTURE),String.valueOf(ECRITURE),String.valueOf(MODIFICATION),String.valueOf(SUPRESSION),String.valueOf(DROIT_INVITATION)};
		return vals;
		
	}
	public String valueOf(String value) {
		String[] Habilitation= {"LECTURE","ECRITURE","MODIFICATION","SUPRESSION","DROIT_INVITATION"};
		int[] Hab= {LECTURE,ECRITURE,MODIFICATION,SUPRESSION,DROIT_INVITATION};
		int i=0; 
		for(String s:Habilitation) {
			if(s.equals(value)) return String.valueOf(Hab[i]);
			i++;
		}
		return null;
	}
		

	public int compareTo(Habilitation o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
