import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1212 {
  // 각각 8진수로 0, 1, 2, 3, 4, 5, 6, 7
  static String binary_num[] = {"000", "001", "010", "011", "100", "101", "110", "111"};
  // 시간초과 문제를 해결하기 위해 StringBuilder 사용함.
  static StringBuilder binary = new StringBuilder();
  
  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String octal = br.readLine(); br.close();
    OctalToBinary(octal);
  }
  
  static void OctalToBinary(String octal) {
    // 8진수 각 숫자를 판단하여, 알맞게 2진수들로 새로운 문자열을 생성한다.
    for(int i=0; i<octal.length(); i++) {
      int index = octal.charAt(i) - '0';
      binary.append(binary_num[index]);
    }
    
    // 2진수로 구성된 문자열 앞에 '0'을 제거하기 위함.
    // ex) 011001100 -> 11001100 으로 만들어주기 위한 과정
    int del_index = 0;
    for(int i=0; i<binary.length(); i++) {
      if(binary.charAt(i) - '0' == 1) {
        break;
      }
      
      del_index++;
    }
    
    // 최종적인 제거
    binary = binary.delete(0, del_index);
    // 출력
    System.out.println(binary.length() == 0 ? 0 : binary);
  }
}