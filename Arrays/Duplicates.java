//  Find All Duplicates in an Array
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 3,2};
        System.out.println(duplicates(arr));
    }

    static List<Integer> duplicates(int[]arr){
        List<Integer> list = new ArrayList<>(10);
        int n = arr.length;
        int[] freqArr = new int[n+1];
        
        for (int i = 0; i < n; i++) {
            freqArr[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if(freqArr[arr[i]]>1){
                list.add(arr[i]);
                freqArr[arr[i]] =0;
            }
        }

        // Brute Force
        // for (int i = 0; i < arr.length-1; i++) {
        //     if(arr[i]==arr[i+1]){
        //         if(!list.contains(arr[i])){
        //             list.add(arr[i]);
        //         }
        //     }
        // }
        

        
        return list;
    }
}
