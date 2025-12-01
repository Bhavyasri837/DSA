import java.util.*;
public class handshake {
    int count=0;
    //recursion method
    public int handshake(int n)
    {
        if(n==1)
            return 0;
        count=count+(n-1);
        handshake(n-1);
        return count;
    }
    
    public static void main(String args[])
    {
        handshake  h=new handshake();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(h.handshake(n));
    }
    
}
