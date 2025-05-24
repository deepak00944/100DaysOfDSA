import java.util.Arrays;

public class SortingAlog {   
    public static void main(String[] args) {
        int [] arr = {5,3,9,0,2};
        selection_sort(arr);
        bubble_sort(arr);
    }

    // Selection sort (O(n^2))
    public static void selection_sort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i] ;
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Bubule sort
    public static void bubble_sort(int[] arr){
        int n = arr.length;
        for (int i = n-1; i >0; i--) {
            for (int j = 0; j <= i-1; j++) {
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble sort: "+Arrays.toString(arr));
    }


}