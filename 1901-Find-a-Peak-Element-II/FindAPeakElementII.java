class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // find max row in this column
            int maxRow = 0;
            for (int i = 0; i < m; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            boolean leftBigger = (mid > 0 && mat[maxRow][mid-1] > mat[maxRow][mid]);
            boolean rightBigger = (mid < n-1 && mat[maxRow][mid+1] > mat[maxRow][mid]);

            if (!leftBigger && !rightBigger) {
                return new int[]{maxRow, mid}; // found peak
            } else if (rightBigger) {
                left = mid + 1;  // move right
            } else {
                right = mid - 1; // move left
            }
        }
        return new int[]{-1, -1};
    }
}
