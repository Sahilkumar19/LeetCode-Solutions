/*
Given the root of a binary tree, imagine yourself standing on the right side of it,
return the values of the nodes you can see ordered from top to bottom.

Example 1:
Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]

 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=null;
        root.right=new TreeNode(2);
//        root.right=new TreeNode(3);
//        root.left.left=null;
//        root.left.right=new TreeNode(5);
//        root.right.left=null;
//        root.right.right=new TreeNode(4);
        List<Integer> ans=rightSideView(root);
        System.out.println(ans);
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if (root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        result.add(root.data);
        while (!queue.isEmpty()){
            int levelsize= queue.size();
            List<Integer> mr=result;
            int n;
            for (int i = 0; i < levelsize; i++) {
                TreeNode currentnode=queue.poll();
                if (currentnode.right!=null){
                    queue.offer(currentnode.right);
                    n=currentnode.right.data;
                    result.add(currentnode.right.data);
                }

            }
//            result.add(n);
        }
        return result;
    }
}
