public class ValidParenthesis{
    public static void main(String[] args){
        String s = "(()())(())";
        System.out.println(removeOuteString(s));
    }

    public static String removeOuteString(String s){
        StringBuilder str = new StringBuilder();
        int cnt =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                cnt++;
                if(cnt>1) str.append(s.charAt(i));
            }else{
                cnt--;
                if(cnt>0) str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}