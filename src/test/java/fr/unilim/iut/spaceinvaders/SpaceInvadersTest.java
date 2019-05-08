package fr.unilim.iut.spaceinvaders;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import fr.unilim.iut.spaceinvaders.utils.HorsEspaceJeuException;
public class SpaceInvadersTest {
	 
	   @Test
	   public void test_AuDebut_JeuSpaceInvaderEstVide() {
		    SpaceInvaders spaceinvaders = new SpaceInvaders(15, 10);
		    assertEquals("" + 
		    "...............\n" + 
		    "...............\n" +
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	        }
	   
	   
	   @Test
		public void test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu() {
			SpaceInvaders spaceinvaders = new SpaceInvaders(15, 10);
			spaceinvaders.positionnerUnNouveauVaisseau(7,9);
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			".......V.......\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
		}
	   
	   @Test(expected = HorsEspaceJeuException.class)
		public void test_unNouveauVaisseauEstPositionneHorsEspaceJeuTropADroite_UneExceptionEstLevee() throws Exception {
			SpaceInvaders spaceinvaders = new SpaceInvaders(15, 10);
			spaceinvaders.positionnerUnNouveauVaisseau(15,9);
		}
}
