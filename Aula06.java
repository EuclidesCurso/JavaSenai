public class MyClass {
  public static void main(String args[]) {
    
    System.out.println("Laço FOR = Para");
    for (int varControle = 0; varControle <= 5; varControle++){
        System.out.println("Volta " + varControle);
    }
    
    System.out.println("Laço WHILE = Enquanto");
    int x = 0;
    while (x <= 5){
        System.out.println("Volta " + x);
        x++;
    }
  }
}