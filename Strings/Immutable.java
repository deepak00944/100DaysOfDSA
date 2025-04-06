public class Immutable {
    public static void main(String[] args) {
        String s1 = "deepak";
        String s2 = s1;
        s1 = s1.concat("Hello");
        System.out.println(s1);
        System.out.println(s2);
    }
}
