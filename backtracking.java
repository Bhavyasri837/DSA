import java.util.*;
public class backtracking {
    public static void subArrays(int[] arr,int index)
    {
        if(index==arr.length)
        {
            for(int num:arr)
            {
                System.out.print(num+" ");
            }
        System.out.println();
        return;
        }
        for(int j=index;j<arr.length;j++)
        {
            //swap
            int temp=arr[index];
            arr[index]=arr[j];
            arr[j]=temp;
            //recurse
            subArrays(arr, index+1);
            //backtrack
            temp=arr[index];
            arr[index]=arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String args[])
    {
        int[] arr={1,2,3};
        subArrays(arr,0);
    }
}
