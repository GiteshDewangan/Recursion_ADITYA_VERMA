import java.util.*;

public class DeleteMiddleFromStack {

    public static void solve(Stack<Integer> s, int k) {
        if (k == 1) {
            s.pop();
            return;
        }
        int temp = s.pop();
        solve(s, k - 1);
        s.push(temp);
    }

    public static void deleteMiddle(Stack<Integer> s) {
        int size = s.size();
        int k = size / 2 + 1;  // middle position (1-based index)
        solve(s, k);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);

        deleteMiddle(st);

        System.out.println("After deleting middle element: " + st);
    }
}
