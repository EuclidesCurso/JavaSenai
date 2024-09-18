
public class Programa {

	public static void main(String[] args) {
		
		int resp = Galinha.soma(7, 2);
		
		Galinha merilu = new Galinha();
		merilu.botar();
		merilu.botar();
		merilu.botar();
		merilu.botar();
		System.out.println("Merilu " + merilu.contagem());
		
		
		Galinha pintadinha = new Galinha();
		pintadinha.botar();
		pintadinha.botar();
		pintadinha.botar();
		System.out.println("Pintadinha " + pintadinha.contagem());
	
		
		Galinha azul = new Galinha();
		azul.botar();
		azul.botar();
		System.out.println("Azul " + azul.contagem());
		
		
		System.out.println("Merilu " + merilu.contagemGranja());
		System.out.println("Pintadinha " + pintadinha.contagemGranja());
		System.out.println("Azul " + azul.contagemGranja());
	}

}
