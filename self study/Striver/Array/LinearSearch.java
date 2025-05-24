// package Striver.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(search(arr, 5));
    }

    public static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
