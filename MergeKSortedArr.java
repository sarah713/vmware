import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArr {
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int k) {
        // Write your code here.
        ArrayList<Integer> res = new ArrayList<>();

        if (k == 0) {
            return res;
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                heap.add(arr[i][j]);
            }
        }

        while (!heap.isEmpty()) {
            res.add(heap.poll());
        }
        return res;
    }
}
