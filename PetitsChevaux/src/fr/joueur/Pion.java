package fr.joueur;

import fr.jeu.Couleur;

public class Pion {
	
	private String id;
	private Couleur couleur;
	
	/**
	 * Constructeur d'un pion
	 * @param id numero unique pour identifier un pion
	 * @param c couleur du pion
	 */
	public Pion(String id, Couleur c) {
		this.id = id;
		this.couleur = c;
	}
	
	/**
	 * Getter de la couleur d'un pion
	 * @return retourne la couleur du pion
	 */
	public Couleur getCouleur() {
		return this.couleur;
	}
	
	/**
	 * Getter de l'id du pion
	 * @return l'id du pion
	 */
	public String getId() {
		return this.id;
	}
	

}