import java.util.*;
public class count_of_words_in_sentence_using_hashmap {
    public static void main(String args[])
    {
        String str="Java JAVA java Code codE";
        str=str.toLowerCase();
        String arr[]=str.split(" ");
        HashMap<String,Integer> freqMap = new HashMap<>();
        for (String ch: arr) 
        {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        for (String ch : freqMap.keySet()) {
            System.out.println(ch + " = " + freqMap.get(ch));
        }
    }
}
         