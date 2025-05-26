public class kadanes {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(nums));
    }

    public static int maxSum(int[] arr){
        int max = arr[0];
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i]+max, arr[i]);
            res = Math.max(max,res);
        }
        return res;
    }
}
