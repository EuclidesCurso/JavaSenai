import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Digite a primeira nota: ");
        String nota1 = teclado.next();
        System.out.println("Digite a segunda nota: ");
        String nota2 = teclado.next();
        
        float notaFloat1 = Float.parseFloat(nota1);
        float notaFloat2 = Float.parseFloat(nota2);
        
        float media = (notaFloat1 + notaFloat2) /2;
        
        boolean resp = media >= 7;
        
        System.out.println("Aprovado = " + resp);
        

    System.out.println(media);
  }
}