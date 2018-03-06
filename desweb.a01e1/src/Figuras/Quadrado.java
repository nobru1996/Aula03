package Figuras;

public class Quadrado extends Figura implements Diagonal{
	private double lado;

		public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
		
		public double area() {
			return lado * lado;
		}
		
		public double diagonal() {
			return lado * Math.sqrt(2.0);
		}

		public double getLado() {
			return lado;
		}

		public void setLado(double lado) {
			this.lado = lado;
		}

		@Override
		public String toString() {
			return "Quadrado [lado=" + lado + "]";
		}
		
}
