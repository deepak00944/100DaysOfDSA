
import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String res = duplicates(str);
        System.out.println(res); 
    }

    public static String duplicates(String str){
        StringBuilder res = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if(!seen.contains(str.charAt(i))){
                seen.add(str.charAt(i));
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
    
}