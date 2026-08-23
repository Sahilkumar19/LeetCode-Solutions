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
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[i].length; j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;


        // the above solution works fine but its quite brute force and it did not pass all the test cases of lc and gave tle. as we can clearly see
        // that we are using nested loop and checking each element. below is the otimized approach that i have implemented.
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return false;
        }
        int s=0;
        int e=matrix.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(matrix[mid][0]>target){
                e=mid-1;
            }else if(matrix[mid][0]<target){
                s=mid+1;
            }else{
                return true;
            }     
        }
        if(e<0){
            return false;
        }
        // now we know the row which might probably contains the target we will apply the binary search in that row. actually r is that row.
        int start=0;
        int end=matrix[r].length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(matrix[r][mid]>target){
                end=mid-1;
            }else if(matrix[r][mid]<target){
                s=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}
