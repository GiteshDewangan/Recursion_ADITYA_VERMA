import java.util.*;

public class ReverseStack {

    public static void reverse(Stack<Integer> st) {
        if (st.size() <= 1) {
            return;
        }
        int temp = st.pop();
        reverse(st);
        insertAtBottom(st, temp);
    }

    public static void insertAtBottom(Stack<Integer> st, int temp) {
        if (st.isEmpty()) {
            st.push(temp);
            return;
        }
        int val = st.pop();
        insertAtBottom(st, temp);
        st.push(val);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("Original Stack: " + st);

        reverse(st);

        System.out.println("Reversed Stack: " + st);
    }
}
