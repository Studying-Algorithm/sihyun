import java.util.Scanner;

public class BJ2588 { 
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt(); String y = scanner.next(); scanner.close();
    
    MultiPly(x, y);
  }
  
  static void MultiPly(int n1, String n2) {
    for(int i=n2.length()-1; i>=0; i--) {
      // char 형태로 바꾼뒤 '0'을 빼준다.
      // 아스키코드 이용 -> 문자인 숫자에서 '0'(48)을 빼주면, 그 숫자의 값이 나오기 때문.
      int idx = n2.charAt(i) - '0';
      System.out.println(n1 * idx);
    }
    
    System.out.println(n1 * Integer.parseInt(n2));
  }
}