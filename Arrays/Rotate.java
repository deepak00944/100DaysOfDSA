import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Rotate obj = new Rotate();

        obj.rotate(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void rotate(int[] arr) {
        // code here
        int i=0, j = arr.length-1;

        while(i!=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }
}
