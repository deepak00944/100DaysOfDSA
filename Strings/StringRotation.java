// Check if Strings Are Rotations of Each Other
// Knuth Morris Pratt (KMP) Algorithm

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        boolean res = rotations(s1, s2);
        System.out.println(res);
    }

    static boolean rotations(String s1, String s2){
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            if(s1.equals(s2)) return true;

            char last = s1.charAt(s1.length()-1);
            s1 = last + s1.substring(0, n-1);
        }
        return false;
    }
}
