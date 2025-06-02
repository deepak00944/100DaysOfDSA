public class ReverseString {
    public static void main(String[] args) {
        String  s = "  hello world  ";
        
        System.out.println(reverseString(s));
    }

    public static String reverseString(String str){
        // String s1 = str.replaceAll("\\s+", " ").trim();
        String[] s = str.split(" +"); // Instead of replaceAll we can use this also
        StringBuilder ans = new StringBuilder();
        for (int i = s.length-1; i>=0;i--) {
            ans.append(s[i]).append(" ");
        }
        return ans.toString().trim(); // trim is used to remove the last space which we will get by the replaceAll
    }
}
