
public class MyClass {
  public static void main(String args[]) {
    
    String CPF = "088.662.348-00";
    
    CPF = CPF.replace("-","").replace(".","");
    
    int nr;
    char[] vetor = CPF.toCharArray();
    int mult = 10;
    int soma=0;
    for(int i = 0; i < 9; i++){
        
        nr = Integer.parseInt(   String.valueOf(vetor[i])   );
        
        soma = soma + (nr * (mult--));
         
        
        System.out.println(nr * (mult--));
    }
     
    

    int dig1;
    int r = 11-(soma % 11);
    if (r >= 10)
      dig1 = 0;
    else
      dig1 = r;
      
    System.out.println(dig1);
    
  }
}