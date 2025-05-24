
// solved with brute and optimized approach
public class ArraySorted {
    public static void main(String[] args) {
        int [] nums = {1,2,4,5,7};
        // int [] nums = {9,8,6,4,2,1};
        // int [] nums = {1,2,3,9,8,6,4};
        System.out.println(sortedOrNot(nums));
    }

    
    public static boolean sortedOrNot(int [] arr){
        // boolean sorted = false;

        // Brute force - O(n^2)

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         sorted = arr[j] >= arr[i];
        //     }
        // }
        // return sorted;

        // Single traverse - O(N)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
            }

        return true;
    }

    
    
}
