import java.util.Scanner;

public class BJ1009 {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    int T = scanner.nextInt();
    for(int i=0; i<T; i++) {
      int a = scanner.nextInt(); int b = scanner.nextInt();    
      
      result(a, b);
    }
    
    scanner.close();
  }
  
  static void result(int a, int b) {
    int result = 1;
    for(int i=0; i<b; i++) {
      result = result * a % 10;
    }
    
    System.out.println(result == 0 ? 10 : result);
  }
}