import java.util.Scanner;

public class BJ11653 {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt(); scanner.close();
    factorization(N);
  }
  
  static void factorization(int N) {
    int idx = N;
    for(int i=2; i<N+1; i++) {
      if(idx % i == 0) {
        idx = idx / i;
        System.out.println(i);
        factorization(idx); break;
      }
    }
  }
}