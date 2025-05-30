
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {
        int arr[] = {100,4,200,1,3,2,3,7,2,5,8,4,6,1};
        System.out.println(longconsecutive(arr));
    }

    public static int longconsecutive(int[] nums){
        // HashSet<Integer> set = new HashSet<>();
        // for(int num: nums){
        //     set.add(num);
        // }
        // int longest =0;
        // for (int num:nums) {
        //     if(!set.contains(num-1)){
        //         int length = 1;

        //         while(set.contains(num+length)){
        //             length++;
        //         }

        //         longest = Math.max(longest , length);
        //     }
        // }
        // return longest;

         if (nums.length == 0) return 0;
        
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int longestStreak = 0;
        
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentStreak = 1;
                int currentNum = num;
                
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
    }
}
