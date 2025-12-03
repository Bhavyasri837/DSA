import java.util.*;
public class unique_elements_in_array_using_hashmap {
    public static void main(String args[])
    {
        HashSet<Integer> set=new HashSet<>();
        int[] arr={1,2,2,2,3,3,4,5,5,4,3,2,1};
        for(int i:arr)
        {
            set.add(i);
        }
        System.out.println(set.size());
    }
    
}
