import java.util.*;
public class backtracking_on_characters {
public static void subArrays(char[] arr,int index)
    {
        if(index==arr.length)
        {
            for(int alphabet:arr)
            {
                System.out.print((char)alphabet+" ");
            }
        System.out.println();
        return;
        }
        for(int j=index;j<arr.length;j++)
        {
            //swap
            char temp=arr[index];
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
        String str="ABC";
        char[] arr=str.toCharArray();
        //char[] arr={'A','B','C'};
        subArrays(arr,0);
    }
}