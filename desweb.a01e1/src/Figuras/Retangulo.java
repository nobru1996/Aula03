package Figuras;

public class Retangulo extends Figura implements Diagonal{
	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public double area() {
		return base * altura;
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(base,2.0) + Math.pow(altura, 2.0));
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
		return "Retangulo [base=" + base + ", altura=" + altura + "]";
	}
}
