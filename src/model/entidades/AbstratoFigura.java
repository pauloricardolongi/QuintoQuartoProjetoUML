package model.entidades;

import model.enums.Color;

public abstract class AbstratoFigura implements Figura {
	
	private Color color;

	public AbstratoFigura(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	
}
