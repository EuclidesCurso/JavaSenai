
public class Circulo extends Forma {
	private double raio = 0;
	
	public Circulo(String nome) {
		super(nome);
	}
	
	public Circulo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getDiametro() {
		return 2 * raio;
	}
	
	@Override
	public String toString() {
		return (getNome() + ", meu raio é " + raio);
	}
	
	@Override
	public double area() {
		return Math.PI * (this.raio * this.raio);
	}
	
	@Override
	public double volume() {
		return 4* Math.PI * (this.raio * this.raio * this.raio) / 3;
	}
	
	
}