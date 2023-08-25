package SAP;

import java.util.Arrays;

public class SecondLargest {
    int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                return arr[i - 1];
            }
        }
        return -1;
    }
}
