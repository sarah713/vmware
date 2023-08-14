
public class IsBST {
    boolean isBST(Node root) {
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean helper(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        }

        return helper(root.left, min, root.data) && helper(root.right, root.data, max);
    }
}

class Node {
    Node right, left = null;
    int data;

    public Node(int data) {
        this.data = data;
    }
}