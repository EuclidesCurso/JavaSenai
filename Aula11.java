import java.util.Scanner;

public class Programas {

	public static void main(String[] args) {
		Scanner tecladoTexto = new Scanner(System.in);
		Scanner tecladoNr = new Scanner(System.in);
		
		System.out.println("Qual o nome do carro: ");
		String fabricante = tecladoTexto.next();
		
		System.out.println("Qual o modelo: ");
		String modelo = tecladoTexto.next();
		
		System.out.println("Qual o ano: ");
		int ano = tecladoNr.nextInt();
		
		Carro carro1 = new Carro(fabricante, modelo, ano);
		
		Pneu p1 = new Pneu (18, 225, "Michellin");
		Pneu p2 = new Pneu (18, 225, "Michellin");
		Pneu p3 = new Pneu (18, 225, "Michellin");
		Pneu p4 = new Pneu (18, 225, "Michellin");
		
		carro1.pDE = p1;
		carro1.pDD = p2;
		carro1.pTE = p3;
		carro1.pTD = p4;
		
		Motor meuMotor = new Motor(10, 10, 300);
		
		carro1.motor = meuMotor;
		
		carro1.acelerar();
		System.out.println(carro1.velocidade);
		carro1.acelerar();
		System.out.println(carro1.velocidade);
		carro1.acelerar();
		System.out.println(carro1.velocidade);
		carro1.acelerar();
		System.out.println(carro1.velocidade);
		
		carro1.frear();
		System.out.println(carro1.modelo
				+ "(" +carro1.calcIdade() + ")");

	}

}