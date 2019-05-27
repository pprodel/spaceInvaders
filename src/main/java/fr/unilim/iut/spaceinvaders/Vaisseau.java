package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.utils.*;

// Peut-être serait-il d'ailleurs intéressant donner une définition de la vitesse dans votre 
//glossaire pour en connaître ses limites et sa mesure dans le cadre de votre application 
// Peut-être est-ce du coup le bon moment pour donner une définition de sprite dans votre glossaire
//A FAIRE
public class Vaisseau extends Sprite {
	
    public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
	    super(dimension, positionOrigine, vitesse);
    }
    
    public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile){
    	if (( dimensionMissile.longueur()) > this.dimension.longueur() )
    	{
			   throw new MissileException("ohlala c tres l'erreur");
    	}
							
		Position positionOrigineMissile = calculerLaPositionDuTirDuMissile(dimensionMissile);

		return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
	}

	private Position calculerLaPositionDuTirDuMissile(Dimension dimensionMissile) {
		int abscisseMilieuVaisseau = this.abscisseLaPlusAGauche() + (this.dimension.longueur() / 2);
		int abscisseOrigineMissile = abscisseMilieuVaisseau - (dimensionMissile.longueur() / 2);

		int ordonneeeOrigineMissile = this.ordonneeLaPlusBasse() - 1;
		Position positionOrigineMissile = new Position(abscisseOrigineMissile, ordonneeeOrigineMissile);
		return positionOrigineMissile;
	}
    
}