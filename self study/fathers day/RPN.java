
import java.util.Stack;

public class RPN {
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int res = evalRPN(tokens);
        System.out.println(res);
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token: tokens){
            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" ->                     {
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a-b);
                    }
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" ->                     {
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a/b);
                    }
                default -> stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
