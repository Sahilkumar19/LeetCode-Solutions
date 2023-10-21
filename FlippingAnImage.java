import java.util.Arrays;

/*
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.

To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0,1,1] results in [1,0,0].

Example 1:
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
 */
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image={
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] result=flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(result));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans=new int[image.length][image.length];
        for(int row=0; row<image.length; row++){
            for(int col=0; col<image.length; col++){
                ans[row][col]=image[row][image.length-1-col]^1;
            }
        }
        return ans;

    }
}
