public class MinInBST {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(9);
        root.left=new TreeNode(7);
        root.right=new TreeNode(10);
        root.left.left=new TreeNode(5);
        root.left.right=new TreeNode(8);
        root.right.left=new TreeNode(9);
        root.right.right=new TreeNode(11);
        int ans=Min(root);
        System.out.println(ans);
    }
    public static int Min(TreeNode root){
        while (root.left != null){
            root=root.left;
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
