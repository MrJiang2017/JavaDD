package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 * @author
 */
public class LevelOrder3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (null!=root){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            LinkedList<Integer> tmp = new LinkedList<>();
            TreeNode node = queue.poll();
            for (int i=queue.size();i>0;i--){
                if ((res.size()&1)==0){
                    tmp.addLast(node.val);
                }else {
                    tmp.addFirst(node.val);
                }
                if (null!=node.left){
                    queue.add(node.left);
                }
                if (null!=node.right){
                    queue.add(node.right);
                }
            }
            res.add(tmp);
        }
        return res;

    }
}
