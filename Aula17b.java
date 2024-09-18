
public abstract class Forma {
	private String nome;
	
	public Forma(String nome) {
		this.nome = nome;
	}
	
	public abstract double area();
	
	public abstract double volume();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
