import java.util.Scanner;

public class BJ1934 {
  // 최대공약수를 전역변수으로 지정함.
  static int gcd = 1;
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    int T = scanner.nextInt();
    
    for(int i=0; i<T; i++) {
      int A = scanner.nextInt(); int B = scanner.nextInt();
      least_common_multiple(A, B);
    }
    
    scanner.close();
  }
  
  static void least_common_multiple(int A, int B) {
    // 두 수인 A, B를 비교하여, 가장 작은 수를 반복의 최대값으로 설정한다.
    // ex) 20, 40일 경우 20 -> 20을 40까지 못 나누기 때문에 나눌수 있는 최대의 값을 지정한 것이다.
    int div_num = A >= B ? B : A; 
    for(int i=1; i<div_num+1; i++) {
      // 두 수가 전부 i의 값으로 나뉘어진다면, 최대공약수를 i로 지정.
      // 나뉘어지는 i의 값이 가장 큰 것으로 최대공약수로 지정한다.
      if(A % i == 0 && B % i == 0) {
        gcd = i;
      }
    }
    
    // 두 수의 곱에서 최대공약수를 나누어 최소공배수를 구한다. 
    System.out.println(A * B / gcd);
  }
}