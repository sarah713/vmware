import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfBT {
    int getMaxWidth(Node root) {
        // Your code here
        if (root == null)
            return 0;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int maxWidth = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            maxWidth = Math.max(maxWidth, size);

            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }

            }

        }
        return maxWidth;
    }
}
