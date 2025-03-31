public class JumpII {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 7};
        System.out.println(minJumps(arr));
    }
 
    static int minJumps(int[] arr){
        int n = arr.length;
        int maxReach =0,jump=0,currReach=0;

        for (int i = 0; i < n; i++) {
            maxReach = Math.max(maxReach,i+arr[i]);

            if(maxReach>=n-1) return jump+1;

            if(i==currReach){
                if(i==maxReach){
                    return -1;
                }else{
                    jump++;
                    currReach=maxReach;
                }
            }
        }
        return jump;
    }
}
