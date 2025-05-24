// package Striver.Array;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,7};
        System.out.println(largestSec(arr));
    }

    public static int largestSec(int[] arr){
        int largeElem = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(largeElem < arr[i]){
                largeElem = arr[i];
            }
        }
        int seclargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(seclargest < arr[i] && arr[i] <largeElem){
                seclargest = arr[i];
            }
        }
        return seclargest;
    }
    // Complexity Time - O(n) and Space - O(1)

    
}
