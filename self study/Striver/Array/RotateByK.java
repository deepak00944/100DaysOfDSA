// package Striver.Array;

import java.util.Arrays;

public class RotateByK {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(rotate(nums, 3)));
    }

    public static int [] rotate(int [] nums, int k){
        int n = nums.length;
        int [] temp = new int[n];

        for (int i = 0; i < temp.length; i++) {
            temp[(i+k)%n] = nums[i];
        }
        nums = Arrays.copyOf(temp, n);
        return nums;
    }
}
