package test;

import model.Boutique;
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
		
		Boutique b1 = new Boutique("Eshop",a1);
		
		Client c1 = new Client("Zelda","Queen");
		Client c2 = new Client("Ganondorf", "Evilking");
	}

}
