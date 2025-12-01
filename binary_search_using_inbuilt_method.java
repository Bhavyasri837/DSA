 import java.util.Arrays;
public class binary_search_using_inbuilt_method{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 9}; 

        int target = 5;

        int index = Arrays.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}