
import java.util.Arrays;

// package Striver.Array;

public class RotateByOne {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        rotate(arr);
    }

    public static void rotate(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];

        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
