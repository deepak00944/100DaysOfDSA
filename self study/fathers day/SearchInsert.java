public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5};
        
        int res = searchInsert(nums, 4);
        System.out.println(res);

    }
    public static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;


        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }else if(target>arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                return start;
            }
        }
        return start;
    }
}

