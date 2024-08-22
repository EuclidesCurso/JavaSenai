
public class Carro {

	String marca;
	String cor;
	int ano;
	
	public String documento() {
		return ("Modelo: " + marca + "; Cor: " + cor + "; Ano: " + ano);

	}

	public Carro(String m, String c, int a) {
		marca = m;
		cor = c;
		ano = a;
	}

}