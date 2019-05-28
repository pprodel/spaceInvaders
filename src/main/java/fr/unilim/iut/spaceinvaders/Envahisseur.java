package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.utils.Dimension;
import fr.unilim.iut.spaceinvaders.utils.Position;

public class Envahisseur extends Sprite {
	
	private String sensDeDeplacement;
	public Envahisseur(Dimension dimensionEnvahisseur, Position positionEnvahisseur, int vitesseEnvahisseur) {
		super(dimensionEnvahisseur, positionEnvahisseur, vitesseEnvahisseur);
		this.sensDeDeplacement="droite";
	}

	

	public String getSensDeDeplacement() {
		return sensDeDeplacement;
	}

	

	public void setSensDeDeplacement(String sensDeDeplacement) {
		this.sensDeDeplacement = sensDeDeplacement;
	}

	

	
	
	

}
