package SAP;

public class SortZeros {
    public static void sort012(int a[], int n) {
        // code here
        int zero = 0, one = 0, two = n - 1;

        while (one <= two) {
            if (a[one] == 0) {
                int tmp = a[zero];
                a[zero] = a[one];
                a[one] = tmp;
                zero++;
                one++;
            } else if (a[one] == 2) {
                int tmp = a[two];
                a[two] = a[one];
                a[one] = tmp;
                two--;
            } else {
                one++;
            }
        }
    }
}
