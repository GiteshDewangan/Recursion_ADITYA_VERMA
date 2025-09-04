import java.util.*;

public class RecursiveStackSort {

    public static void sort(Stack<Integer> st) {
        if (st.size() <= 1) {
            return;
        }
        int temp = st.pop();
        sort(st);
        insert(st, temp);
    }

    public static void insert(Stack<Integer> st, int temp) {
        if (st.isEmpty() || st.peek() <= temp) {
            st.push(temp);
            return;
        }
        int val = st.pop();
        insert(st, temp);
        st.push(val);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(1);
        st.push(0);
        st.push(2);

        sort(st);
        System.out.println("Sorted Stack: " + st);
    }
}
