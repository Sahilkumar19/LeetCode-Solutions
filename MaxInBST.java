/*
Find Highest(the number which is maximum in BST) number in Binary Search Tree

 */
public class MaxInBST {
    public static void main(String[] args) {
        TreeNode root =new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        int ans=HighestInBST(root);
        System.out.println(ans);
    }
    public static int HighestInBST(TreeNode root){
        while (root.right!=null){
            root=root.right;
        }
        return root.data;
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
