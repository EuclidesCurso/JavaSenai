
public class Galinha {

		String nome;
		private int qtdOvos;
		static int qtdGranja;
		
		public void botar () {
			qtdOvos++;
			qtdGranja++;
		}
		
		public int contagem() {
			return qtdOvos;
		}
		
		public int contagemGranja() {
			return qtdGranja;
		}
		
		public static int soma(int a, int b) {
			return a + b;
		}
		
		
}
