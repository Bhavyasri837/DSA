import java.util.*;
public class linear_search {
    public static int search(int[] arr,int target)
    {
        int j=0;
        while(j<arr.length)
        {
            if(arr[j]==target)
            {
                return j;
            }
            j++;
        }
        return -1;
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
    System.out.println(search(arr,target));
   } 
}
