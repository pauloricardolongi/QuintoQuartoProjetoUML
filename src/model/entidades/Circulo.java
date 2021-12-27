package model.entidades;

import model.enums.Color;

public class Circulo extends AbstratoFigura{
	private Double raio;

	public Circulo(Color color, Double raio) {
		super(color);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		
		return Math.PI * raio * raio;
	}
	
	
	
	}
