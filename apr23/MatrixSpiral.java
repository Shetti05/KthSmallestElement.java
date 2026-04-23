public class MatrixSpiral {
    public static void spiral(int[][] m) {
        int top=0, bottom=m.length-1, left=0, right=m[0].length-1;

        while(top<=bottom && left<=right) {
            for(int i=left;i<=right;i++) System.out.print(m[top][i]+" ");
            top++;
            for(int i=top;i<=bottom;i++) System.out.print(m[i][right]+" ");
            right--;
            for(int i=right;i>=left;i--) System.out.print(m[bottom][i]+" ");
            bottom--;
            for(int i=bottom;i>=top;i--) System.out.print(m[i][left]+" ");
            left++;
        }
    }

    public static void main(String[] args) {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        spiral(m);
    }
}