
import java.util.HashSet;
import java.util.Set;

// Given a string S, replace all its characters with #, following the rule that in one operation, you can replace all occurrences of any one character at the same time. Find the minimum number of operations required to replace the entire string.

// Given a string S and a character C, replace all occurrences of C in S with #. Find the number of operations required to completely replace C. 
// Each operation allows replacing one occurrence of C at a time.
public class Replace {
    public static void main(String[] args) {
        int res = minOperations("Deepak");
        System.out.println(res);
    }

    static int minOperations(String str){
        Set<Character> uniqueChar = new HashSet<>();

        // int cnt=0;
        // char c='e';
        // for(char ch:str.toCharArray()){
        //     if(ch == c){
        //         cnt++;
        //     }
        // }
        
        for(char ch:str.toCharArray()){
            uniqueChar.add(ch);
        }
        return uniqueChar.size();
    }
}
