import java.util.Scanner;

public class BJ1924 {
  // 전역변수로 지정
  static int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt(); int y = scanner.nextInt(); scanner.close();
    
    System.out.println(WhatDay(Day(x, y)));
  }
  
  static int Day(int x, int y) {
    int day = 0;
    
    if(x > 1) {
      for(int i=0; i<x-1; i++) {
        day += month[i];
      }
    }
    
    day += y;
    return day;
  }
  
  static String WhatDay(int day) {
    switch(day % 7) {
      case 1:
        return "MON";
      case 2:
        return "TUE";
      case 3:
        return "WED";
      case 4:
        return "THU";
      case 5:
        return "FRI";
      case 6:
        return "SAT";
      case 0:
        return "SUN";
    }
    
    return "";
  }
}