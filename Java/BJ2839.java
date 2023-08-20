import java.util.Scanner;

public class BJ2839_1 {
  static int three = 0;
  
  static void sugar(int N) {
    if(N % 5 == 0) {
      System.out.println(N / 5 + three);
    } else if(N >= 3) {
      three++; N -= 3; sugar(N);
    } else {
      System.out.println("-1");
    }
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt();
    sugar(N);
  }
}