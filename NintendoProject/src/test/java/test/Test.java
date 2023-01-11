package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Achat;
import model.Client;
import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		Console c = new Console("Nintendo Gamecube");
		Jeu j1 = new Jeu("Super Mario Sunshine",c);
		Jeu j2 = new Jeu("Super Smash Bros Melee", c);
		Jeu j3 = new Jeu("Tales of Symphonia", c);
		Jeu j4 = new Jeu("The Legend of Zelda : Wind Waker",c);
		Jeu j5 = new Jeu("Resident Evil 4", c);
		
		List<Achat> listeAchats = new ArrayList();
		
		Achat a1 = new Achat(j1, LocalDate.now(),40.0);
		Achat a2 = new Achat(j2, LocalDate.now(),50.0);
		
		
		Collections.addAll(listeAchats, a1,a2);
		Client client1 = new Client("Arthur","Diot",listeAchats);
		
		System.out.println(client1);
	}

}
