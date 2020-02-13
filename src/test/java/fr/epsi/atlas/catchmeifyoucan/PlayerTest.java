package fr.epsi.atlas.catchmeifyoucan;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.epsi.atlas.catchmeifyoucan.exception.NumberCaseException;

public class PlayerTest {

	Player sut = new Player();
	

	@Test
	public void move_VerificationDeplacementHorizontale() throws Exception {
		sut.setCoordX(0);
		sut.moveX(1);
		assertEquals(1, sut.getCoordX());
	}

	@Test
	public void move_VerificationDeplacementVerticale() throws Exception {
		sut.setCoordY(0);
		sut.moveY(1);
		assertEquals(1, sut.getCoordY());
	}

	@Test
	public void move_NeDoitPasAccepterAutreEntierQueUnEtDeux_coordX() throws Exception {
		try {
			sut.setCoordX(0);
			sut.moveX(0);
			fail("NumberCaseException excepted");
		} catch (NumberCaseException e) {
			assertEquals("Nombre de case n'est pas valide", e.getMessage());
		}
	}

	@Test
	public void move_NeDoitPasAccepterAutreEntierQueUnEtDeux_coordY() throws Exception {
		try {
			sut.setCoordY(0);
			sut.moveY(3);
			fail("NumberCaseException excepted");
		} catch (NumberCaseException e) {
			assertEquals("Nombre de case n'est pas valide", e.getMessage());
		}
	}

	@Test
	public void rotate_rotationDe90aGauche() throws Exception {
		sut.setOrientation(270);
		sut.rotate('G');
		sut.rotate('G');
		assertEquals(90, sut.getOrientation());
	}
	@Test
	public void rotate_rotationDe90aDroite() throws Exception {
		sut.setOrientation(0);
		sut.rotate('D');
		sut.rotate('D');
		assertEquals(180, sut.getOrientation());
	}
	

}
