public class BTTilt {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        BTTilt obj=new BTTilt();
        int ans= obj.findtilt(root);
        System.out.println(ans);

    }
    public int totaltilt=0;
    public int ValueSum(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftsum=ValueSum(root.left);
        int rightsum=ValueSum(root.right);
        int tilt=Math.abs(leftsum-rightsum);
        totaltilt+=tilt;
        return root.data+leftsum+rightsum;

    }
    public int findtilt(TreeNode root){
        this.totaltilt=0;
        this.ValueSum(root);
        return this.totaltilt;
    }
}
