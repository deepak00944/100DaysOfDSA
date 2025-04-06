public class Palindrom {
    public static void main(String[] args) {
        String str = "acbca";
        boolean isPalindrom = false;
        if(str.length() == 1){
             isPalindrom =true; 
             System.out.println(isPalindrom);
             return;
        }
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) == str.charAt(str.length()-1-i)){
                isPalindrom = true;
            }else{
                isPalindrom = false;
                System.out.println(isPalindrom);
                return;
            }
        }
        System.out.println(isPalindrom);
    }
}
