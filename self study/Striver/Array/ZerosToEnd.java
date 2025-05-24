
import java.util.Arrays;

// package Striver.Array;

public class ZerosToEnd {
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        moveZeros(arr);
    }

    public static void moveZeros(int []arr){
        int res [] = new int[arr.length];
        int idx = 0;

        for (int i = 0; i < res.length; i++) {
            if(arr[i] != 0){
                res[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
