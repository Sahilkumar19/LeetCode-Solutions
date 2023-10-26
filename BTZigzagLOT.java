import java.util.*;

/*
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
(i.e., from left to right, then right to left for the next level and alternate between).

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
 */
public class BTZigzagLOT {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.left.left=null;
        root.left.right=null;
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        List<List<Integer>> ans=ZigzagLOT(root);
        System.out.println(ans);
    }
    public static List<List<Integer>> ZigzagLOT(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if (root==null){
            return result;
        }
        Deque<TreeNode> queue=new LinkedList<>();
        queue.addFirst(root);
        boolean reverse=false;

        while (!queue.isEmpty()){
            int levelsize= queue.size();
            List<Integer> levelarray=new ArrayList<>(levelsize);
//            int count=1;
            for (int i = 0; i < levelsize; i++) {
                if (!reverse){
                    TreeNode currentnode=queue.pollFirst();
                    levelarray.add(currentnode.data);
                    if (currentnode.left !=null){
                        queue.addLast(currentnode.left);
                    }
                    if (currentnode.right !=null){
                        queue.addLast(currentnode.right);
                    }
                }else {
                    TreeNode currentnode=queue.pollLast();
                    levelarray.add(currentnode.data);
                    if (currentnode.right !=null){
                        queue.addFirst(currentnode.right);
                    }
                    if (currentnode.left !=null){
                        queue.addFirst(currentnode.left);
                    }
                }

            }
            reverse=!reverse;
            result.add(levelarray);
        }
        return result;
    }
}
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int key){
        data=key;
        left=right=null;
    }
}