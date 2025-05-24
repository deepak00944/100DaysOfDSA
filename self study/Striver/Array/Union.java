
import java.util.Arrays;
import java.util.HashSet;

// package Striver.Array;

public class Union {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        int [] arr = {3,4,5};

        union(arr, nums);
    }

    public static void union(int[] arr, int[] nums){
        HashSet<Integer> uni = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            uni.add(nums[i]);
        }

        for(int i = 0; i<arr.length;i++){
            uni.add(arr[i]);
        }

        int [] res = new int[uni.size()];
        int idx=0;
        for(int n:uni){
            res[idx] = n;
            idx++;
        }
        System.out.println(Arrays.toString(res));
    }
}
