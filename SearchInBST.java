public class SearchInBST {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        SearchInBST o=new SearchInBST();
        System.out.println(o.searchBST(root,2));


    }
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null && root.data != val){
            if(root.data<val){
                root=root.right;
            }else{
                root=root.left;
            }
        }
        return root;
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