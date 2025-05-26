// package self study.Striver.Array;
import java.util.Arrays;
public class SortColors {
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        sortColors(arr);
    }

    public static void sortColors(int[] nums) {
        int c0 = 0, c1 =0, c2=0;
        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 0 -> c0++;
                case 1 -> c1++;
                case 2 -> c2++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(c0>0){
                nums[i] = 0;
                c0--;
                // break;
            }else if(c1>0){
                nums[i] = 1;
                c1--;
            }else if(c2>0){
                nums[i] = 2;
                c2--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
