import java.util.Arrays;

class KthElem{
    public static void main(String[] args) {
        int[] arr= {3,4,2,1,5,7};
        // sort(arr);
        System.out.println("Initial Array: " + Arrays.toString(arr));
        int result = largest(arr, 4);
        int result2 = smallest(arr, 4);
   
        System.out.println("Sorted Array: "+ Arrays.toString(arr));

        System.out.println("Largest: "+ result);
        System.out.println("Smallest: "+result2);
    }
    
    public static int smallest(int [] arr, int k){
        sort(arr);
        int smallestElem = arr[k-1];
        return smallestElem;
    }
    public static int largest(int[] arr, int k){
        sort(arr);
        int largestElem =arr[arr.length-k];
        
        return largestElem;
    }

    public static void sort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j= 0;j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}