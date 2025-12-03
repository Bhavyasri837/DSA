import java.util.*;
public class two_sum_using_hashmap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            int temp=target-arr[i];
            if (map.containsKey(temp)) {
            System.out.println("Pair found: " + arr[i] + " + " + temp + " = " + target);
            System.out.println("Indices: [" + map.get(temp) + ", " + i + "]");
            found=true;
        }
          map.put(arr[i], i);
        }

        if (!found) {
            System.out.println("No pairs found.");
        }
    }
}
