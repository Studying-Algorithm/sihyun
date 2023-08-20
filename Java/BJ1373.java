import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ1373 {
  static StringBuilder result = new StringBuilder();
  
  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String binary = br.readLine();
    
    BinaryToOctal(binary);
  }
  
  static void BinaryToOctal(String str) {
    int remain = str.length() % 3;
    if(remain == 1) {
      result.append(process(str, 0, 1));
    }
   
    if(remain == 2) {
      result.append(process(str, 0, 2) + process(str, 1, 1));
    }
    
    for(int i=remain; i<str.length(); i+=3) {
      result.append(process(str, i, 4) + process(str, i+1, 2) + process(str, i+2, 1));
    }
    
    System.out.println(result);
  }
  
  static int process(String str, int idx, int powNum) {
    return (str.charAt(idx) - '0') * powNum;
  }
}