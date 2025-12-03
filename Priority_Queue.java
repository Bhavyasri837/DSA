import java.util.*;
public class Priority_Queue {
    
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());//use (Collections.reverseOrder()) to delete max heap value
        pq.add(15);                                                            //without (Collections.reverseOrder() it will delete min heap value
        pq.add(50);
        pq.add(20);
        pq.poll();//to delete minimum heap value
        System.out.println(pq);
    }
}
