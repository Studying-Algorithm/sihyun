import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10828_Stack {
  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Integer> stack = new Stack<>();
    
    int N = Integer.parseInt(br.readLine());
    for(int i=0; i<N; i++) {
      String input = br.readLine();
      
      String[] input_arr = input.toString().split(" ");
      switch(input_arr[0]) {
        case "push":
          stack.add(Integer.parseInt(input_arr[1])); break;
        case "pop": 
          System.out.println(!stack.isEmpty() ? stack.pop() : "-1"); break;
        case "size":
          System.out.println(stack.size()); break;
        case "empty":
          System.out.println(stack.isEmpty() ? "1" : "0"); break;
        case "top":
          System.out.println(!stack.isEmpty() ? stack.peek() : "-1"); break;
      }
    }
  }
}