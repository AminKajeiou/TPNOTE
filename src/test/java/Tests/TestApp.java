package Tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import App.Canal;
import App.Role;
import App.Message;
import App.Utilisateur;
import Exception.ActionNonAutoriseeException;

public class TestApp {

	@Test(expected=ActionNonAutoriseeException.class)
	public void TestOK() throws ActionNonAutoriseeException {
		Role role=new Role("Admin");
		Utilisateur u=new Utilisateur("Kajeiou","Amin","AminK","aminkajeiou7@gmail.com");
		Utilisateur u1=new Utilisateur("Kajeiou1","Amin1","AminK1","1aminkajeiou7@gmail.com");
		List<Utilisateur> users = new ArrayList<Utilisateur>();
		users.add(u1);
		Canal canal=new Canal("canal");
		HashMap<Role,List<Utilisateur>> map=new HashMap<Role,List<Utilisateur>>();
		map.put(role, users);
		canal.setMapping_role_utilisateurs(map);
		Message msg=new Message("Test");
		canal.ecrireMessage(u, msg);
	}
}
