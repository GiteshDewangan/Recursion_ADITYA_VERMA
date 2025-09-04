import java.util.*;

public class RecursiveSort {

    // Function to sort the vector recursively
    public static void sort(ArrayList<Integer> v) {
        // Base case
        if (v.size() <= 1) {
            return;
        }

        // Step 1: Take last element out
        int temp = v.get(v.size() - 1);
        v.remove(v.size() - 1);

        // Step 2: Recursively sort remaining elements
        sort(v);

        // Step 3: Insert the last element in sorted vector
        insert(v, temp);
    }

    // Function to insert element in sorted vector
    public static void insert(ArrayList<Integer> v, int temp) {
        // Base case: If vector is empty or last element <= temp
        if (v.size() == 0 || v.get(v.size() - 1) <= temp) {
            v.add(temp);
            return;
        }

        // Otherwise remove last element
        int val = v.get(v.size() - 1);
        v.remove(v.size() - 1);

        // Recursively insert temp
        insert(v, temp);

        // Put back removed element
        v.add(val);
    }

    // Main function to test
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>(Arrays.asList(5, 1, 4, 2, 8));

        sort(v);

        System.out.println("Sorted Vector: " + v);
    }
}
