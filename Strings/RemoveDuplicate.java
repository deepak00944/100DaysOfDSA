import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int num = 1122445233;
        String strNum = String.valueOf(num);
        String res = duplicates(strNum);
        System.out.println(res); 
    }

    public static String duplicates(String str){
        StringBuilder res = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            if(!seen.contains(str.charAt(i))){
                seen.add(str.charAt(i));
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
}
