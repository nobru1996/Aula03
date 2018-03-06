package Figuras;

public class Losango extends Figura{
		private double base;
		private double altura;
		public Losango(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
		}
		
		public double area() {
			return base * altura;
		}

		public double getBase() {
			return base;
		}
		public void setBase(double base) {
			this.base = base;
		}
		
		public double getAltura() {
			return altura;
		}
		
		public void setAltura(double altura) {
			this.altura = altura;
		}
		@Override
		public String toString() {
			return "Losango [base=" + base + ", altura=" + altura + "]";
		}
}
