public class Rev{
    public static void main(String[] args) {
        String str = "Deepak";
        StringBuilder res = new StringBuilder();

        // char[] charArr = str.toCharArray();

        // for (int i = charArr.length-1; i >= 0 ; i--) {
        //     res.append(charArr[i]);
        // }
        // System.out.println(res.toString());

        for (int i = str.length()-1; i >=0; i--) {
            res.append(str.charAt(i));
        }
        System.out.println(res.toString());

    }
}