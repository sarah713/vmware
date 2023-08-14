public class RemoveLLCycle {
    public static void removeLoop(Node head) {
        Node slow = head, fast = head;
        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
            if (!hasCycle) {
                return;
            }
            // find cycle
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }

            while (fast.next != slow) {
                fast = fast.next;
            }

            fast.next = null;
        }
    }
}

class Node {
    int data;
    Node next = null;

    public Node(int data) {
        this.data = data;
    }
}