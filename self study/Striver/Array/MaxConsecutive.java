// package Striver.Array;

public class MaxConsecutive {
    public static void main(String[] args) {
        int [] nums = {1,0,1,1,0,1};
        System.out.println(maxConsecutive(nums));
    }
    public static int maxConsecutive(int [] arr){
        int count = 0;
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count++;
                ans = Math.max(count, ans);
            }else{
                count =0;
            }
        }
        return ans;
    }
}
