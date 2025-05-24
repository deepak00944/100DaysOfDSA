
import java.util.Arrays;
import java.util.HashMap;

public class Majority {
    public static void main(String[] args) {
        int [] nums = {3,2,3};

        int maxVal = nums[0];
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        
        int[] freq = new int[maxVal + 1];
        
        
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > nums.length / 2) {
                System.out.println("Majority element: " + i);
                break;
            }
        }
        Arrays.sort(freq);
        System.out.println(freq[freq.length-1]);

        HashMap<Integer, Integer> countMap = new HashMap<>();
        int majorityCount = nums.length/2;
        for(int num:nums){
            int count = countMap.getOrDefault(num, 0)+1;
            countMap.put(num, count);
            System.out.println(countMap.getOrDefault(num, 0)+1);
            if(count>majorityCount){
                System.out.println(num); 
            }
        }
        System.out.println("");

    }
}
