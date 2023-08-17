public class ReverseKGroup {
    public static Node reverse(Node node, int k) {
        // Your code hereNode
        Node cur = node;
        Node next = null;
        Node prev = null;

        int count = 0;
        Node tmp = node;
        while (count < k && tmp != null) {
            tmp = tmp.next;
            count++;
        }

        if (k == count) {
            while (count > 0 && cur != null) {
                next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
                count--;
            }

            if (next != null) {
                node.next = reverse(next, k);
            }

            return prev;
        } else {
            return reverseRemaining(node);
        }
    }

    public static Node reverseRemaining(Node head) {
        Node prev = null;

        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

class Node {
    Node next = null;
    int data;

    public Node(int data) {
        this.data = data;
    }
}