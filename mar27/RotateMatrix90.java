class RotateMatrix90 {
    static void rotate(int[][] mat) {
        int n = mat.length;

        // transpose
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }

        // reverse rows
        for (int[] row : mat) {
            for (int i = 0, j = n - 1; i < j; i++, j--) {
                int temp = row[i];
                row[i] = row[j];
                row[j] = temp;
            }
        }
    }
}