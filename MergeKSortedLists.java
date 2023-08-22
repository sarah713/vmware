import java.util.PriorityQueue;

public class MergeKSortedLists {
    Node mergeKList(Node[] arr, int K) {
        // Add your code here.
        PriorityQueue<Node> heap = new PriorityQueue<>((a, b) -> a.data - b.data);

        for (Node n : arr) {
            if (n != null) {
                heap.add(n);
            }
        }
        Node head = new Node(0);
        Node tmp = head;
        while (!heap.isEmpty()) {
            Node cur = heap.poll();
            tmp.next = cur;
            tmp = tmp.next;

            if (cur.next != null) {
                heap.offer(cur.next);
            }
        }
        return head.next;
    }
}
