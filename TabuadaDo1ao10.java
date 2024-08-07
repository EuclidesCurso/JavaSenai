import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
    
    Scanner teclado = new Scanner(System.in);
    
    
    for (int numero = 1; numero <= 10; numero = numero + 1){
       
    

        for (int tabuada = 1; tabuada <= 10; tabuada = tabuada + 1){
            System.out.println( numero + " x " + tabuada + " = " + (numero * tabuada) );
        }
        System.out.println("-------------");
    }
  }
}