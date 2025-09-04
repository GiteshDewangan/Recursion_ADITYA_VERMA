import java.util.*;

public class RecursiveSort {
    public static void sort(ArrayList<Integer> v) {
    
        if (v.size() <= 1) {
            return;
        }

    
        int temp = v.get(v.size() - 1);
        v.remove(v.size() - 1);
        sort(v);
        insert(v, temp);
    }

    
    public static void insert(ArrayList<Integer> v, int temp) {
        
        if (v.size() == 0 || v.get(v.size() - 1) <= temp) {
            v.add(temp);
            return;
        }

        int val = v.get(v.size() - 1);
        v.remove(v.size() - 1);

        
        insert(v, temp);
        v.add(val);
    }

    // Main function to test
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>(Arrays.asList(5, 1, 4, 2, 8));

        sort(v);

        System.out.println("Sorted Vector: " + v);
    }
}
