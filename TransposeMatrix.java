import java.util.Arrays;

/*
Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
 */
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] result=transpose(matrix);
        System.out.println(Arrays.deepToString(result));


    }
    public static int[][] transpose(int[][] matrix) {
        int[][] ans=new int[matrix[0].length][matrix.length];
        for(int row=0; row<matrix[0].length; row++){
            for(int col=0; col<matrix.length; col++){
                ans[row][col]=matrix[col][row];
            }
        }
        return ans;
    }
}
