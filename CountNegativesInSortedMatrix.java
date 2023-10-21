/*
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
 */
public class CountNegativesInSortedMatrix {
    public static void main(String[] args) {
        int[][] grid={
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        int ans=countNegatives(grid);
        System.out.println(ans);
    }
    public static int countNegatives(int[][] grid) {
        int count=0;
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]<0){
                    count+=1;
                }
            }
        }
        return count;
    }
}
