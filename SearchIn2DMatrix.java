//PROBLEM
// You are given an m x n integer matrix.
// matrix with the following two properties:
// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.
//You must write a solution in O(log(m * n)) time complexity.
public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target=3;
        Solution S1=new Solution();
        boolean ans=S1.searchMatrix(matrix,target);
        System.out.println(ans);

    }
}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;

    }
}
