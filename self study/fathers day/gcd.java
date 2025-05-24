import java.util.Arrays;

public class gcd {

    public static void main(String args[]){
        int [] nums = {7,9,3};
        int res = findGCD(nums);
        System.out.println(res);
    }

    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int gcd =1;
        int smallestNum = nums[0]; 
        int largestNum = nums[nums.length-1];
        for (int i = 1; i <= smallestNum; i++) {
            if(largestNum%i ==0 && smallestNum % i ==0 ){
                gcd = i;
            }
        }
        
        return gcd;
    }
}