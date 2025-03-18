public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = {2,41,61,73,82};
        maxandmin(arr);
    }

    static void maxandmin(int arr[]){
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if( arr[i]<min){
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(min + " "+ max);
    }
}
