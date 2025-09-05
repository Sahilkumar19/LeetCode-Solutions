/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:
The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

Example 1:
Input: root = [2,1,3]
Output: true
 */

public class ValidateBST {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(1);
        root.right=new TreeNode(3);
        root.left.left=null;
        root.left.right=null;
        root.right.left=new TreeNode(3);
        root.right.right=new TreeNode(7);
        boolean ans=IsValidBST(root);
        System.out.println(ans);
    }
    public static boolean IsValidBST(TreeNode root){
        return helper(root,null,null);
    }

    private static boolean helper(TreeNode root, Integer low, Integer high) {
        if (root==null){
            return true;
        }
        if (low!=null&&root.data<=low){
            return false;
        }
        if (high!=null&&root.data>=high){
            return false;
        }
        boolean leftTree=helper(root.left,low,root.data);
        boolean rightTree=helper(root.right,high, root.data);
        return leftTree&&rightTree;
    }

}
