
/*
recursively find the total number of nodes in a binary tree.(asked in my university exam)

Example:
root=[1,2,3]
output=3
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        System.out.println(BFSTraversal(root));
    }

    public static int BFSTraversal(Node1 root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return 0;
        }
        Queue<Node1> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            for (int i = 0; i < levelsize; i++) {
                Node1 cur = queue.poll();
                if (cur.left != null) {
                    queue.offer(cur.left);
                    result.add(cur.left.data);
                    BFSTraversal(cur.left);

                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                    result.add(cur.right.data);
                    BFSTraversal(cur.right);
                }
            }
        }
        return result.size() + 1;

    }
}

// nodes of the tree
class Node1 {
    int data;
    Node1 left, right;

    public Node1(int key) {
        key = data;
        left = null;
        right = null;
    }
}