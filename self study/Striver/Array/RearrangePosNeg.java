import java.util.Arrays;

public class RearrangePosNeg {
    public static void main(String[] args) {
        int [] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(reaarangeArray(nums)));
    }

    public static int[] reaarangeArray(int [] nums){
        int n = nums.length;
        // ArrayList<Integer> pos = new ArrayList<>();
        // ArrayList<Integer> neg = new ArrayList<>();
       
        // for(int num: nums){
        //     if(num>0){
        //         pos.add(num);
        //     }else{
        //         neg.add(num);
        //     }
        // }

        // for (int i = 0; i < n/2; i++) {
        //     nums[i*2] = pos.get(i);
        //     nums[2*i+1] = neg.get(i);
        // }
        // return nums;

        // Better approach
        int [] ans = new int[n];
        int pos =0, neg=1;

        for(int num : nums){
            if(num>0){
                ans[pos] = num;
                pos +=2;
            }else{
                ans[neg] = num;
                neg += 2;
            }
        }
        return ans;
    }

}
