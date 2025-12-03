import java.util.*;
public class presence_in_both_using_hashset
{
    public static void main(String args[])
    {
        int arr1[]={1,2,3,4,5};
        int arr2[]={4,5,6,7,8};
        HashSet<Integer> set=new HashSet<>();
        //add elements of arr1 to HashSet
        for(int i:arr1)
        {
            set.add(i);
        }
        System.out.println("Common elements in both arrays:");
        //check elemenets of array2
        for(int i:arr2)
        {
            if(set.contains(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}