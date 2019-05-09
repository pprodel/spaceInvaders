package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

    int x;
    int y;
    int longueur;
    int hauteur;

    public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

    public Vaisseau(int longueur, int hauteur, int x, int y) {
	   this.longueur=longueur;
	   this.hauteur=hauteur;
	   this.x = x;
	   this.y = y;
    }

//... occupeLaPosition, seDeplacerVersLaDroite, seDeplacerVersLaGauche, abscisse ...


	
	public boolean occupeLaPosition(int x, int y) {
	     if (estAbscisseCouverte(x) && estOrdonneeCouverte(y))
			return true;
		
	     return false;
    }

private boolean estOrdonneeCouverte(int y) {
	return (ordonneeLaPlusAGauche()<=y) && (y<=ordonneeLaPlusADroite());
}

	private int ordonneeLaPlusADroite() {
		return this.y;
	}

	private int ordonneeLaPlusAGauche() {
		return ordonneeLaPlusADroite()-this.hauteur+1;
	}

	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche() <=x) && (x<=abscisseLaPlusADroite());
	}

	public int abscisseLaPlusADroite() {
		return this.x+this.longueur-1;
	}
		
	public void seDeplacerVersLaDroite() {
	      this.x = this.x + 1 ;
	}
	
	public void seDeplacerVersLaGauche() {
	      this.x = this.x - 1 ;
	}
	
	public int abscisseLaPlusAGauche () {
        return this.x;
	}
	
	public void positionner(int x, int y) {
	    this.x = x;
	    this.y = y;
    }
	
	
}
