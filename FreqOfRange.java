import java.util.HashMap;
import java.util.Map;

public class FreqOfRange {
    public static void frequencyCount(int arr[], int N, int P) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 1; i <= N; i++) {
            if (map.containsKey(i)) {
                arr[i - 1] = map.get(i);
            } else {
                arr[i - 1] = 0;
            }

        }
    }
}
