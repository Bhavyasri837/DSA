import java.util.*;
public class bubblesort {
    public static void bubblesort(int[] arr,int n)
    {                               //0 1 2 3 4 5 6 //n=7
        for(int j=0;j<n;j++)        //5,3,8,4,2,7,9 //k=1
        {                               //0<7-0-1=6
            for(int k=0;k<n-j-1;k++)
            {
                if(arr[k]>arr[k+1])//5>3
                {
                    int temp=arr[k]; //t=5
                    arr[k]=arr[k+1]; //5=3
                    arr[k+1]=temp;  //3=5
                }
            }
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
        bubblesort(arr,n);
        System.out.println("after sorting..............");
        for(int y=0;y<n;y++)
        {
            System.out.print(arr[y]+" ");
        }
    }
}
