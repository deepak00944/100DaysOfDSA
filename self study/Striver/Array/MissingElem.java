

public class MissingElem {
    public static void main(String[] args) {
        int [] arr = {0};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int [] hash = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        for (int i = 0; i < hash.length; i++) {
            if(hash[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
