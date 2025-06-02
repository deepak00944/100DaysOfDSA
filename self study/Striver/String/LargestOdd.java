public class LargestOdd {
    public static void main(String[] args) {
        String num = "2457";
        System.out.println(largestOdd(num));
    }

    public static String largestOdd(String num){
        StringBuilder sb = new StringBuilder(num);
        for(int i=num.length()-1;i>=0;i--)
        {
            char ch = num.charAt(i);
            if((int)ch%2==0)
            {
                sb.deleteCharAt(i);
            }
            else
            {
                return sb.toString();
            }
        }
        return "em";
    }
}
