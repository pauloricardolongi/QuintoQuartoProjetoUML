package aplicacao;

import model.entidades.AbstratoFigura;
import model.entidades.Circulo;
import model.entidades.Retangulo;
import model.enums.Color;

public class Programa {

	public static void main(String[] args) {
		AbstratoFigura s1 = new Circulo(Color.BLACK, 2.0);
		AbstratoFigura s2 = new Retangulo(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Entre com a cor do circulo " + s1.getColor());
		System.out.println("Entre com a área do circulo " + String.format("%.3f", s1.area()));
		System.out.println("Entre com a cor do retangulo " + s2.getColor());
		System.out.println("Entre com a área do retangulo " + String.format("%.3f", s2.area()));

		
	}

}
