
// Maximum Subarray Sum – Kadane’s Algorithm

//  Time Complexity: O(n)
// Space Complexity: O(1)

/* 
// Explanation: 
In this problem, we have to find the maximum subarray sum. We can solve this problem using Kadane’s algorithm. Here, we will initialize two variables max and res with 0. Then we will iterate over the array
and for each element, we will update max as the maximum of (max+arr[i], arr[i]) and res as the maximum of (max, res). At the end of the iteration, res will have the maximum subarray sum.  */

public class kadanes{
    public static void main(String[] args){
        int[] arr = {5, 4, 1, 7, 8};
        int max=0,res=0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max+arr[i], arr[i]);
            res = Math.max(max,res);
        }
        System.out.println(res);
    }
}