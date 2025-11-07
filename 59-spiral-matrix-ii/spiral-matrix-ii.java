class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int l = 0, r = n - 1;
        int t= 0, b = n - 1;
        int num = 1;

        while (l <= r && t <= b) {
            for (int i = l; i <= r; i++) {
                res[t][i] = num++;
            }
            t++;
            for (int i = t; i <= b; i++) {
                res[i][r] = num++;
            }
            r--;
            if (t<= b) {
                for (int i = r; i >= l; i--) {
                    res[b][i] = num++;
                }
                b--;
            }
            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    res[i][l] = num++;
                }
                l++;
            }
        }

        return res;
    }
}
