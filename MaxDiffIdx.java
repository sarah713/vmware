public class MaxDiffIdx {
    int maxIndexDiff(int arr[], int n) {
        int[] maxRight = new int[n];
        maxRight[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], arr[i]);
        }
        int i = 0, j = 0;
        int maxIdx = -1;
        while (i < n && j < n) {
            if (arr[i] <= maxRight[j]) {
                maxIdx = Math.max(maxIdx, j - i);
                j++;
            }
            i++;
        }
        return maxIdx;
    }
}
