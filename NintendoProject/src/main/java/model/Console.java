package model;

import java.time.LocalDate;

abstract public class Console {

	protected String nom;
	protected Double prix;
	protected LocalDate dateSortie;

	public Console(String nom, Double prix, LocalDate dateSortie) {
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + "]";
	}
	
	
}
