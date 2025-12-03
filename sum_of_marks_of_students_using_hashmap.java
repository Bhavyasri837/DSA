import java.util.*;
public class sum_of_marks_of_students_using_hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Input
        map.put("ramu", 23);
        map.put("sita", 78);
        map.put("ravan", 89);
        map.put("ravi", 50);

        int total = 0;

        // Calculate total
        for (int marks : map.values()) {
            total += marks;
        }

        // Output
        System.out.println("Total Marks: " + total);
    }
}
