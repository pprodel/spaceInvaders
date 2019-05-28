package fr.unilim.iut.spaceinvaders;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;

import fr.unilim.iut.spaceinvaders.utils.*;
public class EnvahisseurTest {
private SpaceInvaders spaceinvaders;
	
	@Before
	public void initialisation() {
		spaceinvaders = new SpaceInvaders(15, 10);
	}
}
