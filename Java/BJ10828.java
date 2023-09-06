import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10828 {
  static List<Integer> stack = new ArrayList<>();
  
  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = br.read() - '0';
    for(int i=0; i<N; i++) {
      String input = br.readLine();
      
      String[] input_arr = input.toString().split(" ");
      switch(input_arr[0]) {
        case "push":
          push(Integer.parseInt(input_arr[1])); break;
        case "pop":
          pop(); break;
        case "size":
          size(); break;
        case "empty":
          empty(); break;
        case "top":
          top(); break;
      }
    }
    
    br.close();
  }
  
  // 정수 x를 스택에 넣는다.
  static void push(int X) {
    stack.add(X);
  }
  
  // 스택에서 가장 위에 있는 정수를 빼고, 출력. IF 스택이 비어있다면, -1 출력
  static void pop() {
    if(!stack.isEmpty()) {
      int indexTop = stack.size() - 1;
      System.out.println(stack.remove(indexTop));
      
    } else { System.out.println(-1); }
  }

  // 스택에 들어있는 정수의 개수를 출력한다.
  static void size() {
    System.out.println(stack.size());
  }
  
  // 스택이 비어있으면, 1 or not 0
  static void empty() {
    System.out.println(stack.isEmpty() ? 1 : 0);
  }

  // 스택의 가장 위에 있는 정수를 출력한다. IF 스택이 비어있다면, -1 출력
  static void top() {
    if(!stack.isEmpty()) {
      int indexTop = stack.size() - 1;
      System.out.println(stack.get(indexTop));
      
    } else { System.out.println(-1); }
  }
}