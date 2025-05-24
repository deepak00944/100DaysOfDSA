import java.util.Arrays;

public class SortingAlog {   
    public static void main(String[] args) {
        int [] arr = {5,3,9,0,2};
        sort1(arr);
    }

    // Selection sort
    public static void sort1(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i] ;
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}