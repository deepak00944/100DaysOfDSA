// package Striver.Array;

public class LargestElem {
    public static void main(String[] args) {
        int [] arr = {2,5,61,83,4,7};
        System.out.println(findLarge(arr));
    }
    // brute force - we can just sort the array and get the last element

    // recursive
    public static int findLarge(int [] arr){

        int largeElem = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(largeElem < arr[i]){
                largeElem = arr[i];
            }
        }
        return largeElem;
    }
}
