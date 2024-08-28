
public class Carro {

	String fabricante;
	String modelo;
	int ano;
	
	Pneu pDE;
	Pneu pDD;
	Pneu pTE;
	Pneu pTD;
	
	Motor motor;
	
	int velocidade = 0;
	
	
	public int calcIdade() {
		return 2024 - ano;
	}
	
	public Carro() {}
	
	public Carro(String fabricante, String modelo, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
	}

	public void acelerar() {
		if (velocidade < 250)
			velocidade = velocidade + motor.potencia; 
	}
	
	public void frear() {
		if (velocidade > 0) {
			velocidade = velocidade - motor.potencia;
		
		}
	}
}