package SAP;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(x - i)) {
                return true;
            } else {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        return false;
    }
}
