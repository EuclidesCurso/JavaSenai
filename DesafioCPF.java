public class MyClass {
	public static void main(String args[]) {

		String CPF = "900.589.430-05";
		CPF = CPF.replace("-", "").replace(".", "");

		int acum = 0;
		int multiplicador = 10;
		for (int i = 0; i <= 8; i++) {
			int nr = Character.getNumericValue(CPF.charAt(i));
			acum = acum + (nr * multiplicador);
			multiplicador--;
		};

		int resp = 11 - (acum % 11);
		int dig1 = (resp >= 10 ? 0 : resp);
		
		//--------------------------------------------------------------
		
		acum = 0;
		multiplicador = 11;
		for (int i = 0; i <= 9; i++) {
			int nr = Character.getNumericValue(CPF.charAt(i));
			acum = acum + (nr * multiplicador);
			multiplicador--;
		};

		resp = 11 - (acum % 11);
		int dig2 = (resp >= 10 ? 0 : resp);
		
		System.out.println(dig1 + "" + dig2);

	}
}
