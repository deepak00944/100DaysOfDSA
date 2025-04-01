import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7};
        int[] b = {0, 2, 6, 8, 9};

        // merge1(a, b);
        merge2(a, b);
    }

    static void merge1(int[] a, int [] b){
        int[] c = new int[a.length+b.length];
        int idx=0;
        for (int i = 0; i < a.length; i++) {
            c[idx++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[idx++] = b[i];
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }

    static void merge2(int[] a, int[] b){
        int n = a.length;
        int m = b.length;
        for (int i = n-1, j=0; i >= 0 && j<m; i--,j++) {
            if(a[i]>b[j]){
                int t = a[i];
                a[i] = b[j];
                b[j] = t;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            str.append(a[i]).append(" ");
        }
        for (int i = 0; i < b.length; i++) {
            str.append(b[i]).append(" ");
        }
        System.out.println(str);
    }
}
