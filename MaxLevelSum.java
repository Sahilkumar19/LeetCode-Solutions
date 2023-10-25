/*
Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.
Return the smallest level x such that the sum of all the values of nodes at level x is maximal.

Example 1:

Input: root = [1,7,0,7,-8,null,null]
Output: 2
Explanation:
Level 1 sum = 1.
Level 2 sum = 7 + 0 = 7.
Level 3 sum = 7 + -8 = -1.
So we return the level with the maximum sum which is level 2.
 */
import java.util.*;
public class MaxLevelSum {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(7);
        root.right=new Node(0);
        root.left.left=new Node(7);
        root.left.right=new Node(-8);
        root.right.left=null;
        root.right.right=null;
        int ans=MaxSum(root);
        System.out.println(ans);
    }
    public static int MaxSum(Node root){
        ArrayList<Integer> result=new ArrayList<>();
        if (root==null){
            return 0;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelsize= queue.size();
            int levelsum=0;
            for (int i = 0; i < levelsize; i++) {
                Node currentnode=queue.poll();
                levelsum+= currentnode.data;
                if(currentnode.left !=null){
                    queue.offer(currentnode.left);
                }
                if (currentnode.right != null){
                    queue.offer(currentnode.right);
                }
            }
            result.add(levelsum);
        }
        int maxindex=0;
        int max= result.get(0);
        for(int i=0; i<result.size(); i++){
            int current= result.get(i);
            if (current>max){
                max=current;
                maxindex=i;
            }
        }
        return maxindex+1;
    }

}
class Node{
    int data;
    Node left,right;
    public Node(int key){
        data=key;
        left=right=null;

    }
}
