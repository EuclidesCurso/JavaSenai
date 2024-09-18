
public class Quadrado extends Forma{
	private double lado = 0;
	
	public Quadrado(String nome) {
		super(nome);
	}

	public Quadrado(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public String toString() {
		return (getNome() + ", meu lado é " + lado);
	}
	
	@Override
	public double area() {
		return (this.lado * this.lado);
	}
	
	@Override
	public double volume() {
		return (this.lado * this.lado * this.lado);
	}
	
}
