package SAP;

public class isCircular {
    boolean isCircular(Node head) {
        // Your code here
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Loop detected
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false; // No loop detected
    }
}
