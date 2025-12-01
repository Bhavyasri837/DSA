import java.util.*;
public class generating_combinations {
    public static void generate(int[] arr,int n)
    {
        System.out.println("total number of combinations:"+Math.pow(2,n));
        System.out.println("combinations are:");
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
        generate(arr,n);
    }
}
