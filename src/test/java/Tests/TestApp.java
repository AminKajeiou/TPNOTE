package Tests;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import App.Canal;
import Enums.Habilitation;
import App.Role;
import App.Message;
import App.Utilisateur;
import Exception.ActionNonAutoriseeException;

public class TestApp {

	@Test(expected=ActionNonAutoriseeException.class)
	public void TestOK() throws ActionNonAutoriseeException {
		Role role=new Role("Admin");
		Utilisateur u=new Utilisateur();
		Utilisateur u1=new Utilisateur("Kajeiou1","Amin1","AminK1","1aminkajeiou7@gmail.com");
		List<Utilisateur> users = new ArrayList<Utilisateur>();
		users.add(u1);
		Canal canal=new Canal();
		HashMap<Role,List<Utilisateur>> map=new HashMap<Role,List<Utilisateur>>();
		map.put(role, users);
		canal.setMapping_role_utilisateurs(map);
		Message msg=new Message();
		canal.ecrireMessage(u, msg);
	}
	

    @Test
    public void ecrireMessageOK() throws ActionNonAutoriseeException {
        // Etape 1 : pr�paration des objets
        Canal c = new Canal();

        Message m = new Message();
        m.setDestinaire(c);
        m.setTexte("Bonne f�tes de fin d'ann�e !");

        Utilisateur utilisateur = new Utilisateur();
        c.getMapping_role_utilisateurs().put(new Role("Membre"), Arrays.asList(utilisateur));
        c.getMapping_role_habilitations().put(new Role("Membre"), Arrays.asList(Habilitation.ECRITURE));

        // Etape 2 : appel de la m�thode test�e
        c.ecrireMessage(utilisateur, m);

        // Etape 3 test du retour
        List<Message> historiques = c.getHistoriques();
        Assert.assertEquals(1, historiques.size());
        System.out.println(historiques.get(0).getTexte());
    }

    @Test
    public void ecrireMessageKO() {

        // Etape 1 : pr�paration des objets
        Canal c = new Canal();

        Message m = new Message();
        m.setDestinaire(c);
        m.setTexte("Bonne ann�e 2021 !");

        Utilisateur utilisateur = new Utilisateur();

        // Etape 2 : appel de la m�thode test�e
        try {
            c.ecrireMessage(utilisateur, m);

            // Etape 3 test du retour
            fail("L'exception aurait du �tre lev�e, on ne doit pas passer ici !");
        } catch (ActionNonAutoriseeException e) {

            // Etape 3 test du retour = si on arrive ici, le test est concluant
        }
    }
}
