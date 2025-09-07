import java.util.*;

public class UniqueSubsetsString {
    
    static Set<String> uniqueSubsets = new HashSet<>();

    static void solve(String ip, String op) {
        if (ip.length() == 0) {
            uniqueSubsets.add(op); // store unique subset
            return;
        }

        char ch = ip.charAt(0);   // pick first char
        ip = ip.substring(1);     // erase first char (like erase in C++)

        // choice 1 → exclude
        solve(ip, op);

        // choice 2 → include
        solve(ip, op + ch);
    }

    public static void main(String[] args) {
        String ip = "aab"; // input
        String op = "";

        solve(ip, op);

        System.out.println("Unique Subsets:");
        for (String subset : uniqueSubsets) {
            System.out.println("\"" + subset + "\"");
        }
    }
}
