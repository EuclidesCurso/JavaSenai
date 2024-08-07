import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite um número para calcular a tabuada: ");
    int numero = teclado.nextInt();
    

    for (int tabuada = 1; tabuada <= 10; tabuada = tabuada + 1){
        System.out.println( numero + " x " + tabuada + " = " + (numero * tabuada) );
        
    }
  }
}