import java.util.Scanner;

public class MyClass {
public static void main(String args[]) {

Scanner teclado = new Scanner (System.in);

    System.out.println("Digite o salário: " );
    float salario = teclado.nextFloat();
    
    
    if (salario < 1000.00)
        System.out.println("o aumento é de 25% " + salario * 0.25 + " o salário atual seria de R$" + salario * 1.25 );
    else{
        if (salario >=1000.00 && salario<2000.00)
            System.out.println("o aumento é de 15% " + salario * 0.15 + " o salário atual seria de R$" + salario * 1.15);
        else
            if (salario > 2000.00)
            System.out.println("o aumento é de 10% " + salario * 0.10 + " o salário atual seria de R$" + salario * 1.10);
    }


    }
}