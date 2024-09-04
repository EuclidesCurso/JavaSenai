import java.time.LocalDate;

public class Programa {

	public static void main(String[] args) {
		
		Aluno samuel = new Aluno();
		samuel.nome = "Samuel";
		samuel.cpf = "000.000.000-00";
		samuel.dtNasc = "01/01/1994";
		samuel.curso = "Java Foundations";
		System.out.println(samuel.apresentarSe());
		System.out.println(samuel.dtNasc);
		
		Professor bit = new Professor();
		bit.nome = "Bittencourt";
		bit.salario = 20_000_000; //não dá pra colocar vírgula, pois vírgula é apenas para atribuir variáveis (ex. int a, b, c)
		System.err.println(bit.apresentarSe()); //ERR é pra deixar o print em vermelho

	}

}