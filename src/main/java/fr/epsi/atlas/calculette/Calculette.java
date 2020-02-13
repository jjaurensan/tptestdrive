package fr.epsi.atlas.calculette;

import fr.epsi.atlas.calculette.exception.DelimitersException;

public class Calculette {

	private static final String DELIMITERS = ",|\\n";

	public int add(String valeur) throws DelimitersException{
		
		if (valeur.equals("")) {
			return 0;
		}
		if (valeur.contains(",")||valeur.contains("\n")) {
			String[] chaines = valeur.split(DELIMITERS);
			int resultat = 0;
			for (String valeurIndividuelle : chaines) {
				if(valeurIndividuelle.equals("")) {
					throw new DelimitersException("Il ne peut pas avoir plusieurs delimiteurs consecutifs");
				}
				resultat += Integer.valueOf(valeurIndividuelle);
				}			
			return resultat;
		}
		return Integer.valueOf(valeur);
	}

}
