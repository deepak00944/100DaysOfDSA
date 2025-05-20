




public class Practice {
    public static void main(String[] args) {
        // int[] a = {1,2,3,4,5};
        // int[] b ={1,2,3};
        // int res=0;

        // int[] cnt = new int[(int)(1e5+5)];
        // for (int i : a) {
        //     cnt[i]++;
        // }
        
        // for (int i : b) {
        //     cnt[i]++;
        // }

        // for (int i : cnt) {
        //     if(i>0){ 
        //         res++;
        //     }
        // }
        // System.out.println(res);
        // Set<Integer> list = new HashSet<>(10);
        // for (int i = 0; i < a.length; i++) {
        //     list.add(a[i]);
        // }
        // for (int i = 0; i < b.length; i++) {
        //     list.add(b[i]);
        // }

        // System.out.println(list.size());
        int num =20;
        boolean isPrime = true;
        if(num<=1) isPrime = false;
        for(int i = 2; i*i<=num;i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }else{
                isPrime = true;
            }
        }
        if(isPrime){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not a Prime");
        }
    }

    // Prime
    public static void isPrime(){

    }
//     static void negative(int[] arr){
//         // int [] temp = new int[arr.length];
//         // int idx =0;
//         // for (int i = 0; i < temp.length; i++) {
//         //     if(arr[i]<0){
//         //         temp[idx] = arr[i];
//         //         idx++;
//         //     }
//         // }
//         // for (int i = 0; i < temp.length; i++) {
//         //     if(arr[i]>0){
//         //         temp[idx] = arr[i];
//         //         idx++;
//         //     }
//         // }

//         // int left =0, right=0;
//         // while(right<arr.length){
//         //     if(arr[right]<0){
//         //         int temp = arr[left];
//         //         arr[left] = arr[right];
//         //         arr[right] = temp;
//         //         left++;
//         //     }
//         //     right++;
//         // }

        
//         System.out.println(Arrays.toString(arr));
//     }
}
