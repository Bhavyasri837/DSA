import java.util.*;
public class frequency_of_each_digit_in_number_using_hashmap {
    public static void main(String args[])
    {
        int num=1122334561;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(num!=0)
        {
            int digit=num%10;
            map.put(digit,map.getOrDefault(digit,0)+1);
            num/=10;
        }
        System.out.println();
        for (int i = 0; i <=6; i++) {
            int count = map.getOrDefault(i, 0);
            System.out.println(i + " = " + count);
        }
    }
}
