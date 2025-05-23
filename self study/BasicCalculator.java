import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        int res = calculate(s);
        System.out.println(res);
    }

    public static int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int number=0;
        int result = 0;
        int sign =1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                number = 10*number + (int)(ch-'0');
            }
            if(s.charAt(i) == '+'){
                result += sign*number;
                number = 0;
                sign = 1;
            }else if(s.charAt(i) == '-'){
                result += sign*number;
                number = 0;
                sign = -1;
            }else if(s.charAt(i) == '('){
                st.push(result);
                st.push(sign);
                sign =1;
                result =0;
            }else if(s.charAt(i) == ')'){
                result += sign*number;
                number =0;
                result *= st.pop();
                result += st.pop(); 
                
            }
        }
        if(number != 0) result += sign * number;
        return result;
    }
}
