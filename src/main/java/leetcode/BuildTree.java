package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如，给出
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * @author
 */
public class BuildTree {
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    int[] po;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        po= preorder;
        return buildTree(0,preorder.length-1,0,inorder.length-1);
    }
    public TreeNode buildTree(int pl,int pr,int il,int ir){
        if(pl>pr){
            return null;
        }
        int val = map.get(po[pl]);
        TreeNode root = new TreeNode(po[pl]);
        root.left=buildTree(pl+1,val-il+pl,il,val-1);
        root.right = buildTree(val-il+pl+1,pr,val+1,ir);
        return root;
    }
}
