class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int[][] maxs = new int[matrix.length][matrix[0].length];

        init(maxs, matrix, k);
        for (int i = 1; i < matrix.length; i ++) {
            for (int j = 1; j < matrix[0].length; j ++) {
                maxs[i][j] = maxs[i - 1][j] + maxs[i][j - 1] - maxs[i - 1][j - 1] + matrix[i][j];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < maxs.length; i ++) {
            for (int j = 0; j < maxs[0].length; j ++) {
                for (int m = i; m < maxs.length; m ++) {
                    for (int n = j; n < maxs[0].length; n ++) {
                        int tmp = maxs[m][n];
                        if (i - 1 >= 0) {
                            tmp -= maxs[i - 1][n];
                        }
                        if (j - 1 >= 0) {
                            tmp -= maxs[m][j - 1];
                        }
                        if (i - 1 >= 0 && j - 1 >= 0) {
                            tmp += maxs[i - 1][j - 1];
                        }
                        if (tmp <= k) {
                            max = Math.max(max, tmp);
                        }
                    }
                }
            }
        }
        return max;
    }
    private void init(int[][] maxs, int[][] matrix, int k) {
        for (int i = 0; i < matrix.length; i ++) {
            if (i == 0) {
                maxs[i][0] = matrix[i][0];
            }
            else {
                maxs[i][0] = maxs[i - 1][0] + matrix[i][0];
            }
        }
        for (int j = 0; j < matrix[0].length; j ++) {
            if (j == 0) {
                maxs[0][j] = matrix[0][j];
            }
            else {
                maxs[0][j] = maxs[0][j - 1] + matrix[0][j];
            }
        }
    }
}