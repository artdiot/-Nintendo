package model;

import java.util.List;

public class Client {
	
	private String nom;
	private String prenom;
	private List<Achat> listeAchats;
	
	public Client(String nom, String prenom, List<Achat> listeAchats) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.listeAchats = listeAchats;
	}
	public List<Achat> getListeAchats() {
		return listeAchats;
	}
	public void setListeAchats(List<Achat> listeAchats) {
		this.listeAchats = listeAchats;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", listeAchats=" + listeAchats + "]";
	}
	
	

}
