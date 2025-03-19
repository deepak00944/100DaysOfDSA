
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort012(arr);
    }

    public static void sort012(int[] arr){
        int c0=0, c1=0, c2=0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0 -> c0++;
                case 1 -> c1++;
                case 2 -> c2++;
            }
        }

        int idx= 0;
        for (int i = 0; i < c0; i++) {
            arr[idx++] = 0; 
        }

        for (int i = 0; i < c1; i++) {
            arr[idx++] = 1; 
        }

        for (int i = 0; i < c2; i++) {
            arr[idx++] = 2; 
        }
        System.out.println(Arrays.toString(arr));
    }
}
