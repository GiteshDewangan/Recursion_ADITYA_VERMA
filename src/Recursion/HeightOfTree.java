package Recursion;

public class HeightOfTree {




    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    class Solution {
        public int height(Node root) {
            // Base case: if root is null, return 0
            if (root == null) {
                return 0;
            }

            // Recursively calculate height of left and right subtrees
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            // Return the maximum height + 1 (for current node)
            return 1 + Math.max(leftHeight, rightHeight);
        }
    }

}
