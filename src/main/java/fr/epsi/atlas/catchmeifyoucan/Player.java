package fr.epsi.atlas.catchmeifyoucan;

import fr.epsi.atlas.catchmeifyoucan.exception.NumberCaseException;

public class Player {

	private int coordX;
	private int coordY;
	private int orientation;

	public void moveX(int i) throws NumberCaseException {
		if (i == 0 || i >= 3) {
			throw new NumberCaseException("Nombre de case n'est pas valide");
		}
		this.coordX += i;

	}

	public void moveY(int i) throws NumberCaseException {
		if (i == 0 || i >= 3) {
			throw new NumberCaseException("Nombre de case n'est pas valide");
		}
		this.coordY += i;
	}

	public void rotate(Character c) {
		if (c.equals('G')) {
			if (this.orientation == 270) {
				this.orientation = 0;
			} else {
				this.orientation += 90;
			}

		} else {
			if (this.orientation == 0) {
				this.orientation = 270;
			} else {
				this.orientation -= 90;
			}
		}

	}

	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}

}
