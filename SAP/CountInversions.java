package SAP;

class CountInversions {
    static long inversionCount(long arr[], long N) {
        long tmp[] = new long[(int) N];
        return mergeSort(arr, tmp, 0, N - 1);
    }

    static long mergeSort(long arr[], long tmp[], long l, long r) {
        long mid, inv_count = 0;
        if (r > l) {
            mid = (l + r) / 2;
            inv_count = mergeSort(arr, tmp, l, mid);
            inv_count += mergeSort(arr, tmp, mid + 1, r);
            inv_count += merge(arr, tmp, l, mid + 1, r);

        }
        return inv_count;
    }

    static long merge(long arr[], long tmp[], long l, long mid, long r) {
        long i, j, k, inv_count = 0;
        i = l;
        k = l;
        j = mid;
        while ((i <= mid - 1) && j <= r) {
            if (arr[(int) i] <= arr[(int) j]) {
                tmp[(int) k++] = arr[(int) i++];
            } else {
                tmp[(int) k++] = arr[(int) j++];
                inv_count = inv_count + (mid - i);
            }
        }
        while (i <= mid - 1)
            tmp[(int) k++] = arr[(int) i++];

        // Copying the remaining elements of right subarray(if there are any)
        // to temp.
        while (j <= r)
            tmp[(int) k++] = arr[(int) j++];

        // Copying back the merged elements to original array.
        for (i = l; i <= r; i++)
            arr[(int) i] = tmp[(int) i];

        return inv_count;
    }
}