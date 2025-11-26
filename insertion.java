import java.util.*;
public class insertion {
    public static void insersion(int[] arr, int n)
    {
        for(int i=1;i<n;i++)
        {
            int min=arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>min;j--)
            {
                arr[j+1]=arr[j];
            }
            arr[j+1]=min;
        }
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
        insersion(arr,n);
        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
    
}
