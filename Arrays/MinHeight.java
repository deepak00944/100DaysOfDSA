// Minimize the maximum difference between the heights
import java.util.Arrays;

public class MinHeight {
    public static void main(String[] args) {
        int [] arr = {1 ,8 ,10 ,6 ,4 ,6 ,9 ,1};
        System.out.println(getMinDiff(arr, 7));
    }

    static int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int res = arr[n-1]-arr[0];
        int min_elem, max_elem;
        for(int i =1; i<=n-1; i++){
            if(arr[i]>=k){
                max_elem = Math.max(arr[i-1]+k, arr[n-1]-k);
                min_elem = Math.min(arr[0]+k, arr[i]-k);
                res = Math.min(res, max_elem - min_elem);
            }
        }
        
        return res;
    }
}
