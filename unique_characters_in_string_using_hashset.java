import java.util.*;
public class unique_characters_in_string_using_hashset {
    public static void main(String args[])
    {   
        String str="MISSISSIPPI";
        HashSet<Character> set=new HashSet<>();
        for(int i=str.length()-1;i>=0;i--)
        {
            set.add(str.charAt(i));
        }
        System.out.println(set);
    }
}
