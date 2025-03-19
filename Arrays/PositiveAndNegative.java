// Move all negative numbers to beginning and positive to end with constant extra space

import java.util.Arrays;

public class PositiveAndNegative {
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6};
        segregateElements(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void segregateElements(int[] arr) {
        
        // Optimized
        int left =0, right =0;
        
        while(right < arr.length){
            if(arr[right]<0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
            }
            right++;
        }

        // Brute Force
        // int[] temp = new int[arr.length];
        // int idx=0;
        // for (int i = 0; i < temp.length; i++) {
        //     if(arr[i]>0){
        //         temp[idx++] = arr[i];
        //     }
        // }
        // for (int i = 0; i < temp.length; i++) {
        //     if(arr[i]<0){
        //         temp[idx++] = arr[i];
        //     }
        // }

    }
    
}
