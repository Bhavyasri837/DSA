import java.util.*;
public class selection_sort {
    public static void selection(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int k:arr)
        {
        System.out.print(k+" ");
    }
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int x=0;x<n;x++)
        {
            arr[x]=sc.nextInt();
        }
        selection(arr,n);
    }
    
}
