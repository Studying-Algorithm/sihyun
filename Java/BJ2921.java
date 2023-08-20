import java.util.Scanner;

public class BJ2921 {
  static int n = 1;
  static int result = 0;
  
  static int calculate(int N) {
    // n + (n+1) + (n+2) + ... + (n+N)
    for(int i=0; i<n + 1; i++) {
      result += n + i;
    }
    
    if(n == N) {
      return result;
    }
    
    n++;
    return calculate(N);
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt(); scanner.close();
    System.out.println(calculate(N));
  }
}