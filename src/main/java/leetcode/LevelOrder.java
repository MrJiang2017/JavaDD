package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
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
 *   [9,20],
 *   [15,7]
 * ]
 * 提示：
 * 节点总数 <= 1000
 * @author
 */
public class LevelOrder {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root){
        resuc(root,0);
        return res;

    }

    public void resuc(TreeNode node,int index){
        if (node==null){
            return;
        }
        if (index<=res.size()){
            res.add(new ArrayList<Integer>());
            res.get(index).add(node.val);
            resuc(node.left,index+1);
            resuc(node.right,index+1);
        }
    }
}
