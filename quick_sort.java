import java.util.*;
public class quick_sort {
public static void quicksort(int[] arr,int l,int r)
{
    if(l<r)
    {
        int pivot=prevent(arr,l,r);
        quicksort(arr, l, pivot-1);
        quicksort(arr, pivot+1, r);
    }
}
public static int prevent(int [] arr,int l,int r)
{
    int pivot=arr[l];
    int low=l+1;
    int high=r;
    while(low<high)
    {                                                                       //1.insertion
        while(low<=high && pivot>=arr[low])                                  //2.quick 
        {                                                                   //3.selection
            low++;                                                          //4.merge
        }                                                                   //5.bubble
        while(low<=high && pivot<arr[high] )
        {
            high--;
        } 
        if(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
        }  
    }
    arr[l]=arr[high];
    arr[high]=pivot;
    return high;
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
        quicksort(arr,0,n-1);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    
}
