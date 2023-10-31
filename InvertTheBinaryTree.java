/*
Given the root of a binary tree, invert the tree, and return its root.

Example 1:
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InvertTheBinaryTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(9);
        List<Integer> ans=invertTree(root);
        System.out.println(ans);
    }
    public static List<Integer> invertTree(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if (root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        result.add(root.data);
        while (!queue.isEmpty()){
            int levesize= queue.size();
            for (int i = 0; i < levesize; i++) {
                TreeNode currentnode=queue.poll();
                if (currentnode.right!=null){
                    queue.offer(currentnode.right);
                    result.add(currentnode.right.data);
                }
                if (currentnode.left!=null){
                    queue.offer(currentnode.left);
                    result.add(currentnode.left.data);
                }
            }
        }
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
