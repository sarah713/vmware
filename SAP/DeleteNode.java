package SAP;

public class DeleteNode {
    Node deleteNode(Node head, int x) {
        // Your code here
        if (head == null) {
            return null;
        }
        if (x == 1) {
            return head.next;
        }
        int i = 0;
        Node prev = head, cur = head;
        while (cur != null) {
            i += 1;
            if (i == x) {
                prev.next = cur.next;
            }
            prev = cur;
            cur = cur.next;
        }
        return head;
    }
}
