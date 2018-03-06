package teste;

import Figuras.Diagonal;
import Figuras.Figura;
import Figuras.Losango;
import Figuras.Quadrado;
import Figuras.Retangulo;
import Figuras.Triangulo;

public class Geometria {
	public String area(Figura f) {
		return ""+f+"area = " + f.area();
		
	}
	
	public static void main(String[] args) {
		
		Geometria g = new Geometria();
		
		Figura losango = new Losango(10.0, 5.0);
		Figura triangulo = new Triangulo(10.0, 5.0);
		Diagonal retangulo = new Retangulo(7.0, 3.0);
		Diagonal quadrado = new Quadrado(6.0);
		

		System.out.println(g.area(losango));
		System.out.println(g.area(triangulo));
		System.out.println(g.area(retangulo));
		System.out.println(g.area(quadrado));
		Diagonal diagonal = (Diagonal)retangulo;
		System.out.println(Diagonal).diagonal());
		System.out.println(Diagonal).diagonal());
	}
}
