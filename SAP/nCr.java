package SAP;

public class nCr {
    static int nCr(int n, int r) {
        int modulo = (int) (Math.pow(10, 9) + 7);
        if (r == 0 || n == 0) {
            return 1;
        }

        int[][] dp = new int[n + 1][r + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % modulo;
                }
            }
        }
        return dp[n][r];
    }
}
