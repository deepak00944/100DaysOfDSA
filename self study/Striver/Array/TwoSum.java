import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

    public static int[] twoSum(int[] arr, int target){

        // Brute Force
        // int [] res = new int[2];
        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[i]+arr[j] == target){
        //             res[0] = i;
        //             res[1] = i+1;
        //         }
        //     }
        // }
        // return res;

        // ArrayList<Integer> list = new ArrayList<>(10);
        // for (int i = 0; i < arr.length; i++) {
        //     int diff = target - arr[i];
        //     if(list.contains(diff)){
        //         return new int[]{i,list.indexOf(diff)};
        //     }
        //     list.add(arr[i]);
        // }
        // return new int[]{0,0};\

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                return new int[]{i, map.get(diff)};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
}
