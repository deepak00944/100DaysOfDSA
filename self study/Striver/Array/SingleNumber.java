

// package Striver.Array;

public class SingleNumber {
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        System.out.println(single(nums));
    }

    public static int single(int[] arr){
        int[] hash = new int[arr.length];
        for (int i = 0; i < hash.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if(hash[arr[i]] ==1){
                return arr[i];
            }
        }
        return -1;

    }
}
