
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4,10};
        PriorityQueue<Integer> prique = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            prique.add(nums[i]);
        }
        System.out.println(prique);
        int k = 2;
        int f = k - 1 ;
        while (f > 0) {
            prique.remove()  ;
            f-- ;
        }
        System.out.println(prique);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        pq.add(10);
        pq.add(20);
        pq.add(15);

    System.out.println(pq);


    }
}
