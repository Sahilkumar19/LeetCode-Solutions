/*
Given the root of a binary search tree and a node p in it, return the in-order successor of that node in the BST. If the
given node has no in-order successor in the tree, return null.
The successor of a node p is the node with the smallest key greater than p.val.

Example 1:
Input: root = [2,1,3], p = 1
Output: 2
Explanation: 1's in-order successor node is 2. Note that both p and the return value is of TreeNode type.

Algorithm

If the value of the root node is less than or equal to the value of the p node, it means that the successor
node of p must be in the right subtree, so this function is recursively called on the right child node.
If the value of the root node is greater than the value of p, then it is possible that the root node is the
successor of p, or a node in the left subtree is a successor of p, * So first call this function recursively
on the left child node, * If it returns empty, indicating that the root node is a successor node, just return,
* If it is not empty, return that node

 */

public class InOrderSuccessorInBST {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(20);
        root.right=new TreeNode(100);
        root.left.left=new TreeNode(10);
        root.left.right=new TreeNode(30);
        root.right.left=new TreeNode(80);
        root.right.right=new TreeNode(110);
        TreeNode ans=InOrderSuccessor(root,new TreeNode(110));
        if (ans==null){
            System.out.println(ans);
        }
        else {
            System.out.println(ans.data);
        }



    }
    public static TreeNode InOrderSuccessor(TreeNode root,TreeNode p){
        if (root==null){
            return null;
        }
        if (root.data<= p.data){
            return InOrderSuccessor(root.right,p);
        }
        else {
            TreeNode leftnode=InOrderSuccessor(root.left,p);
            if (leftnode == null) {
                return root;
            } else {
                return leftnode;
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
