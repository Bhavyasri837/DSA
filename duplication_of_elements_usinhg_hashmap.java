import java.util.*;
public class duplication_of_elements_usinhg_hashmap 
{
    public static void main(String args[])
    {
        int arr[]={10,20,30,30,30,30,20,20,10,10,10,5,6};
        HashMap<Integer,Integer> data=new HashMap<>();
        for(int i:arr)
        {
            data.put(i,data.getOrDefault(i, 0)+1);
        }
        for(int key:data.keySet())
        {
            if(data.get(key)>1)
            {
                System.out.println(key+"  is dupliacted");
            }
            else{
                System.out.println(key+"  is  not dupliacted");
            }
        }
    }
}

