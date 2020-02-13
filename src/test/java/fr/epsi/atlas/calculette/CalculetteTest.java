package fr.epsi.atlas.calculette;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.epsi.atlas.calculette.exception.DelimitersException;

public class CalculetteTest {

	private Calculette sut;

	@Before
	public void initCalculette() {
		sut = new Calculette();
	}

	@Test
	public void add_chaineVide_retourneZero() throws Exception {
		int resultat = sut.add("");

		assertEquals(0, resultat);
	}

	@Test
	public void add_chaineRepresentantUn_retourneUn() throws Exception {
		int resultat = sut.add("1");

		assertEquals(1, resultat);
	}

	@Test
	public void add_chaineRepresentantDeuxNombresEntiers_retourneLaSommeDeCesNombres() throws Exception {
		int resultat = sut.add("1,2");

		assertEquals(3, resultat);
	}

	
	@Test
	public void add_chaineRepresentantXnombresEntiers_retourneLaSommeDeCesNombres() throws Exception {
		int resultat = sut.add("1,2,3");

		assertEquals(6, resultat);
	}

	@Test
	public void add_accepteRetourChariotCommeSeparateurSuplementair() throws Exception {
		int resultat = sut.add("1\n2,3");

		assertEquals(6, resultat);
	}

	@Test
	public void add_nAcceptePasDeuxDelimiteursConsecutifs_DelimitersException() throws Exception {

		try {
			sut.add("1,\n2");
			fail("DelimitersException excepted");
		} catch (DelimitersException e) {
			assertEquals("Il ne peut pas avoir plusieurs delimiteurs consecutifs", e.getMessage());
		}
	}

}
