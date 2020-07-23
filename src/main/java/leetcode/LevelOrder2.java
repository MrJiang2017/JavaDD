package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回：
 * [3,9,20,15,7]
 * @author
 */
public class LevelOrder2 {
    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> arr = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (null!=node){
                arr.add(node.val);
                if (null!=node.left){
                    queue.add(node.left);
                }
                if (null!=node.right){
                    queue.add(node.right);
                }
            }
        }
        int[] res = new int[arr.size()];
        for (int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}
