
import java.util.Stack;

// 1249. Minimum Remove to Make Valid Parentheses
public class MinRemove {
    public static void main(String[] args) {
        String s = "))((";
        System.out.println(minRemoveToMakeValid(s));
    }
    public static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        char [] charArr = s.toCharArray();
        
        for (int i = 0; i < charArr.length; i++) {
            if(charArr[i] == '('){
                stack.push(i);
            }else if(charArr[i]==')'){
                if (!stack.isEmpty() && charArr[stack.peek()] == '(') {
                    stack.pop();
                } else {
                    charArr[i] = '*';
                }
            }
        }

        while (!stack.isEmpty()) {  
            charArr[stack.pop()] = '*';
        }

        for (char c : charArr) {
            if (c != '*') {
                res.append(c);
            }
        }
        if(res.isEmpty()){
            return "\"\"";
        }

        return res.toString();
    }
}
