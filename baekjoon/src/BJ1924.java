import java.util.Scanner;

public class bj1924 {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt(); int y = scanner.nextInt();
    
    BJ1924_Calendar calendar = new BJ1924_Calendar(x, y);
    calendar.result();
  }
}

class BJ1924_Calendar {
  int x;
  int y;
  int day = 0;
  
  //1월부터 12월까지의 일수를 리스트로 만듦.
  int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  
  BJ1924_Calendar(int x, int y) {
    this.x = x; this.y = y;
  }
  
  void result() {
    // 입력한 '월' 값이 1 이상이면, 입력한 '월' 전까지의 일수들을 더한다.
    if(x > 1) {
      for(int i=0; i<x-1; i++) {
        day += month[i];
      }
    }
    
    // 입력한 해당 '월'의 입력한 '일'을 더한다.
    day += y;
    
    // 7로 나눈 나머지가 1~0 까지 순서대로 '월, 화, 수, 목, 금, 토, 일'
    switch(day % 7) {
      case 1:
        System.out.println("MON"); break;
      case 2:
        System.out.println("TUE"); break;
      case 3:
        System.out.println("WED"); break;
      case 4:
        System.out.println("THU"); break;
      case 5:
        System.out.println("FRI"); break;
      case 6:
        System.out.println("SAT"); break;
      case 0:
        System.out.println("SUN"); break;
    }
  }
}