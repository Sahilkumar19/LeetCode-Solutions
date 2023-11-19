/*
In Order predecessor in BST same as successor.
 */
public class InOrderPredecessorInBST {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(20);
        root.right=new TreeNode(100);
        root.left.left=new TreeNode(10);
        root.left.right=new TreeNode(30);
        root.right.left=new TreeNode(80);
        root.right.right=new TreeNode(110);
        TreeNode ans=InOrderPredecessor(root,new TreeNode(110));
        if (ans==null){
            System.out.println(ans);
        }
        else {
            System.out.println(ans.data);
        }
    }
    public static TreeNode InOrderPredecessor(TreeNode root,TreeNode p){
        if (root==null){
            return null;
        }
        if (root.data>= p.data){
            return InOrderPredecessor(root.left,p);
        }
        else {
            TreeNode rightnode=InOrderPredecessor(root.right,p);
            if (rightnode==null){
                return root;
            }else {
                return rightnode;
            }
        }
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
