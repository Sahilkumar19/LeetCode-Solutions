/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.
Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]
 */
import java.util.ArrayList;
import java.util.List;

public class BTInOrderTraversal {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=null;
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        List<Integer> ans=inorderTraversal(root);
        System.out.println(ans);
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.add(root.data);
        result.addAll(inorderTraversal(root.right));
        return result;
    }
}
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int key){
        key=data;
        left=right=null;
    }
}
