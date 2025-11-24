import java.util.*;
public class binary_search {
    public static int bsearch(int[] arr,int target)
    { 
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end- start) / 2; 

            if (arr[mid] == target)
            {
                return mid; 
            } else if (arr[mid] < target) 
            {
                start = mid + 1; 
            } else 
            {
                end = mid - 1; 
            }
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
        System.out.println(bsearch(arr,target));
    }
}