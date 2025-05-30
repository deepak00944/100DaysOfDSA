
import java.util.ArrayList;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        leaders(arr);
    }

    public static void leaders(int [] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    leader = false;
                    break;
                } 
            }
            if(leader){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
