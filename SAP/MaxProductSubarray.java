package SAP;

public class MaxProductSubarray {
    long maxProduct(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        int maxEnd = arr[0];
        int minEnd = arr[0];
        int maxProd = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                int tmp = maxEnd;
                maxEnd = minEnd;
                minEnd = tmp;
            }

            maxEnd = Math.max(arr[i], maxEnd * arr[i]);
            minEnd = Math.min(arr[i], minEnd * arr[i]);

            maxProd = Math.max(maxProd, maxEnd);
        }
        return (long) maxProd;
    }
}
