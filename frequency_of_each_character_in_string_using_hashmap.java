import java.util.*;
public class frequency_of_each_character_in_string_using_hashmap {
    public static void main(String args[])
    {
        String str="MISSISSIPPI";
        char[] arr=str.toCharArray();
        HashMap<Character,Integer> freqMap = new HashMap<>();
        for (char ch: arr) 
        {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
         for (char ch : freqMap.keySet()) {
            System.out.println(ch + " = " + freqMap.get(ch));
        }
    }
}

