import java.util.PriorityQueue;

class KthSmallest {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        // Your code here
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = l; i <= r; i++) {
            heap.offer(arr[i]);
        }
        int res = 0;
        while (k > 0) {
            res = heap.poll();
            k--;
        }

        return res;
    }
}