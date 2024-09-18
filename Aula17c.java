
public class Programa {

	public static void main(String[] args) {
		
		Circulo bolinha1 = new Circulo("Circulo", 5);
		
		Quadrado quadro1 = new Quadrado("Quadrado", 10);
		
		Forma forma1 = bolinha1;
		Forma forma2 = quadro1;
		
		System.out.println(forma1.volume());
		System.out.println(forma2.volume());
		
		System.out.println(bolinha1);
		System.out.println(quadro1);		
	}

}
