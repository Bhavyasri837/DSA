import java.util.*;
public class searching_target_element_in_an_array{
    public static boolean search(int[] arr,int target,int n)
    {
        for(int j=0;j<n;j++)
        {
        if(arr[j]==target)
        {
            return true;
        }
    }
            return false;
}  
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int target=sc.nextInt();
        System.out.println(search(arr,target,n));
        }
}