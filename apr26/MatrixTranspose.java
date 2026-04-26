public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6}};
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}