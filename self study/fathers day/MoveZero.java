// 283. Move Zeroes
import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int [] res = new int[nums.length];
        int idx=0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] != 0){
                res[idx] = nums[i];
                idx++;
            }
        }

        for(int i = 0; i<nums.length; i++){
            nums[i] = res[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
