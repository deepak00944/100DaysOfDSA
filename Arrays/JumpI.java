// Jump Game Can you reach till the end of array

public class JumpI {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));
    }

    static boolean minJumps(int[] arr){
        if(arr[0] ==0) return false;
        int n =arr.length;
        int maxIndex=0;
        for (int i = 0; i < n-1; i++) {
            if(i > maxIndex){
                return false;
            }
            maxIndex = Math.max(maxIndex, i+arr[i]);
           
        }
        return true;
    }
}