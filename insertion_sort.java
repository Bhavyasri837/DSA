import java.util.*;
public class insertion_sort {
    public static void insertion(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            int min=arr[i];
            int j=i-1;
            while(j>=0 && min<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=min;
        }
    
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int k=0;k<n;k++)
        {
            arr[k]=sc.nextInt();
        }
        insertion(arr, n);
        for(int x=0;x<n;x++)
        {
            System.out.print(arr[x]+" ");
        }

    }
    
}
