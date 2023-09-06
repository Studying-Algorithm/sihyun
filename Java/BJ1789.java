import java.util.Scanner;

public class BJ1789 {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    long S = scanner.nextLong(); scanner.close();
    
    int i = 0;
    while(S >= 0) {
      i++;
      S -= i;
    }
    
    System.out.println(i-1 == 0 ? 1 : i-1);
  }
}