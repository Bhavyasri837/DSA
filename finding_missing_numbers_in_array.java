import java.util.*;
public class finding_missing_numbers_in_array {
    public static void main(String args[])
    {
        HashSet<Integer> set=new HashSet<>(); 
        int[] arr={1,2,4,5,6,7,8};
        for(int i:arr)
        {
            set.add(i);
        }
        for(int i=0;i<10;i++)
        {
            if(!set.contains(i))
            {
                System.out.println(i);
            }
        }
    }
}