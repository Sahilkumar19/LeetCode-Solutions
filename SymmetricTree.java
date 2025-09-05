import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
        root.left.left=null;
        root.left.right=new TreeNode(3);
        root.right.left=null;
        root.right.right=new TreeNode(3);
        boolean ans=IsSymmetric(root);
        System.out.println(ans);
    }
    public static boolean IsSymmetric(TreeNode root){
        List<Integer> Holder=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if (root==null){
            return false;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize= queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentnode=queue.poll();
                if (currentnode.left!=null){
                    Holder.add(currentnode.left.data);
                    queue.offer(currentnode.left);
                }
                if (currentnode.right!=null){
                    Holder.add(currentnode.right.data);
                    queue.offer(currentnode.right);
                }

            }
        }
        System.out.println(Holder);
        int unique=0;
        for(int n:Holder){
            unique^=n;
        }
        return unique==0;
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
