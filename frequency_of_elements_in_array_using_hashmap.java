import java.util.*;
public class frequency_of_elements_in_array_using_hashmap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2,2,3,4,3,4,3,4,5,6,5,6};
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print frequency of numbers from 0 to 9
        for (int i = 0; i <=6; i++) {
            int count = freqMap.getOrDefault(i, 0);
            System.out.println(i + " = " + count);
        }
    }
}
