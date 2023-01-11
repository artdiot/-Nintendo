package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Achat;
import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Jeu;
import model.Salon;

public class Test {

	public static void main(String[] args) {
		Console c = new Salon("Nintendo Gamecube",250.0,LocalDate.parse("2003-01-05"));

		Adresse a = new Adresse("24","rue test","jesaispas");
		Boutique b = new Boutique("la boutique",a);
		
		Jeu j1 = new Jeu("Super Mario Sunshine",c,b);
		Jeu j2 = new Jeu("Super Smash Bros Melee", c,b);
		Jeu j3 = new Jeu("Tales of Symphonia", c,b);
		Jeu j4 = new Jeu("The Legend of Zelda : Wind Waker",c,b);
		Jeu j5 = new Jeu("Resident Evil 4", c,b);
		
		List<Achat> listeAchats = new ArrayList();
		
		Achat a1 = new Achat(j1, LocalDate.now(),40.0);
		Achat a2 = new Achat(j2, LocalDate.now(),50.0);
		
		
		Collections.addAll(listeAchats, a1,a2);
		Client c1 = new Client("Arthur","Diot",listeAchats);

		
		System.out.println(c1);
	}

}
