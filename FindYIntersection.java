public class FindYIntersection {
    int intersectPoint(Node head1, Node head2) {
        // code here
        Node d1 = head1, d2 = head2;
        while (d1 != d2) {
            d1 = (d1 == null) ? head2 : d1.next;
            d2 = (d2 == null) ? head1 : d2.next;
        }
        return (d1 != null) ? d1.data : -1;
    }
}
