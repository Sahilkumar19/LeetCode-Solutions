/*
Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.
Two nodes of a binary tree are cousins if they have the same depth with different parents.
Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.

Example 1:
Input: root = [1,2,3,4], x = 4, y = 3
Output: false
 */
import java.util.LinkedList;
import java.util.Queue;
public class CousinInBT {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
//        root.left.left=null;
//        root.left.right=new TreeNode(4);
//        root.right.left=null;
//        root.right.right=new TreeNode(5);
        int x=4;
        int y=3;
        boolean ans=IsCousin(root,x,y);
        System.out.println(ans);

    }
    public static boolean IsCousin(TreeNode root, int x, int y){
//        if (root==null){
//            return false;
//        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean foundX = false;
        boolean foundY = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            foundX = false;
            foundY = false;
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.data==x) foundX = true;
                if(node.data==y) foundY = true;
                if(node.left!=null&&node.right!=null){
                    if((node.left.data==x&&node.right.data==y)||(node.left.data==y&&node.right.data==x)){
                        return false;
                    }
                }
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            if(foundX&&foundY){
                return true;
            }
        }
        return false;

    }
}
