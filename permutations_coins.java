import java.util.*;
public class permutations_coins {
    public static void permutations(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        permutations(n-1,ans+"1");
        permutations(n-1, ans+"0");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        permutations(n," ");

    }
}
