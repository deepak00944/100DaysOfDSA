import java.util.Arrays;

public class RearrangePosNeg {
    public static void main(String[] args) {
        int [] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(reaarangeArray(nums)));
    }

    public static int[] reaarangeArray(int [] nums){
        int n = nums.length;
        int [] pos = new int[n/2];
        int res[] = new int[n];
        int [] neg = new int[n/2];
        int i=0,j=0;
        for(int num: nums){
            if(num>0){
                pos[i] = num;
                i++;
            }else{
                neg[j] = num;
                j++;
            }
        }

        for (int j2 = 0; j2 < n; j2++) {
            if(j2%2 ==0){
                for (int i1 = 0; i1 < i; i1++) {
                    res[i] = pos[i1];
                }
            }else{
                for (int i1 = 0; i1 < j; i1++) {
                    res[j] = neg[i1]
                }

            }
            
        }
        return res;
    }

}
