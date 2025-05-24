

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] nums = {1,1,2,2,3,3};
        System.out.println(duplicates(nums));
    }

    public static int duplicates(int[] nums){

        // To print the array
        // HashSet<Integer> seen = new HashSet<>();
        // int[] nums = new int[arr.length];
        // int idx = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if(!seen.contains(arr[i])){
        //         seen.add(arr[i]);
        //         nums[idx] = arr[i];
        //         idx++;
        //     }
        // }
        // return nums;
    
        int i =0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
