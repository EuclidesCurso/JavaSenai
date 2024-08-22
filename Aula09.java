public class Programa {

	public static void main(String[] args) {
		
		Carro volks = new Carro ("Gol", "Amarelo", 2010);
		
		Carro gm = new Carro ("Corsa", "Vermelho", 2012);
		
		System.out.println(volks.documento());
		System.out.println(gm.documento());
	}

}
