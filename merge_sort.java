import java.util.*;
public class merge_sort {
    public static void mergesort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int m=l+(r-l)/2;
            mergesort(arr,l,m);
            mergesort(arr,m+1,r);
            merge(arr,l,m, r);
        }
    }
    public static void merge(int[] arr,int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for(int j=0;j<n1;j++)
        {
            L[j]=arr[l+j];
        }
        for(int k=0;k<n2;k++)
        {
            R[k]=arr[m+1+k];
        }
        int j=0,k=0,x=l;
        while(j<n1 && k<n2)
        {
            if(L[j]<=R[k])
            {
                arr[x]=L[j];
                j++;
            }
            else{
                arr[x]=R[k];
                k++;
            }
            x++;
        }
        while(j<n1)
        {
            arr[x]=L[j];
            j++;
            x++;
        }
        while(k<n2)
        {
            arr[x]=R[k];
            k++;
            x++;
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
        mergesort(arr,0,n-1);
        for(int y=0;y<n;y++)
        {
            System.out.print(arr[y]+" ");
        }
    }
}
