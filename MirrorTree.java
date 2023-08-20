public class MirrorTree {
    void mirror(Node node) {
        if (node == null) {
            return;
        }

        Node left = node.left;
        node.left = node.right;
        node.right = left;

        mirror(node.left);
        mirror(node.right);
    }
}

class Node {
    Node left = null;
    Node right = null;
    int data;

    public Node(int data) {
        this.data = data;
    }
}