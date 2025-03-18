
import java.util.Arrays;

class Reverse{
    public static void main(String[] args) {
        int [] arr = {4,5,8,4,3,9,6};
        reverse(arr);
    }

    public static void reverse(int [] arr){
        int len = arr.length;
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[len -i-1];
            arr[len-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}