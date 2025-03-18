
public class Reverse {
    public static void main(String[] args) {
        String str = "Deepak";
        reverse(str);
    }

    // public static void reverse(String str) {
        // String str1 = new String();
        // int len = str.length();
        // for (int i = 0; i <len ; i++) {
        //     char ch = str.charAt(len-1-i);
        //     str1 = str1+ch; // O(N^2) due to concate
        // }
    //     System.out.println(str1);
    // }


    // Optimized
    public static void reverse(String str) {
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(len-i-1));
        }
        System.out.println(sb); // O(1) time per append
    }

    // OR We can use StringBuilder sb = new StringBuilder(str); sb.reverse();

}
