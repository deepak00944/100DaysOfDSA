import java.util.Arrays;

public class RotateArray {
  public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6,7};
    rotate(arr,3);
  }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[n];
        int idx=0;
        for(int i =k+1; i<n; i++){
            arr[idx] = nums[i];
            idx++;
        }
        for(int i = k; i<n-k;i++){
          arr[i] = nums[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}