import java.util.ArrayList;
import java.util.LinkedList;

public class Programa {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.nome = "Bittencourt";
		a.cpf = "123.456.789-10";
		a.curso = "TI";
		
		Pessoa p =  new Aluno(); //tipo PESSOA, conteudo ALUNO
		p.nome = "Bittencourt";
		p.cpf = "123.456.789-10";
		//p.curso = "TI";
		
		Aluno a1 = (Aluno)p; // abrir um parenteses antes da atribuição para dar certeza ao programa que pode rodar CAST
		System.out.println(a1.nome);
		
		Pessoa p1 = new Pessoa(); // quando da um NEW leva toda a classe para essa atribuição
		p1.nome = "Marcelo";
		
		//Aluno a2 = (Aluno)p1; NÃO PODE O PAI NO FILHO, FALTAM ATRIBUTOS NO PAI QUE
		//PODERIAM SER CHAMADOS NO FILHO. NÃO, NÃO;
		//System.out.println(a2.nome);
		
		Aluno ze = new Aluno();
		ze.nome = "Zé";
		
		Aluno manuel = new Aluno();
		manuel.nome = "Manuel";
		
		Professor julio = new Professor();
		julio.nome = "Julio";
		
		Professor lucas = new Professor();
		lucas.nome = "Lucas";
		
		ArrayList<Pessoa> lista = new ArrayList<>();
		lista.add(ze);
		lista.add(manuel);
		lista.add(julio);
		lista.add(lucas);
		
		for (Pessoa pessoa : lista) { // chamado de FOR IT
			System.out.println(pessoa.nome);
			
		}
		
	}

}