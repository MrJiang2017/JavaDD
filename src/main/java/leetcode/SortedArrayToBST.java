package leetcode;

/**
 * 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
 *
 * 示例:
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *           0
 *          / \
 *        -3   9
 *        /   /
 *      -10  5
 *
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return treeHelper(nums,0,nums.length-1);
    }
    public TreeNode treeHelper(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid = (left+right)/2;
        TreeNode root =new TreeNode(nums[mid]);
        root.left = treeHelper(nums,left,mid-1);
        root.right = treeHelper(nums,mid+1,right);
        return root;
    }
}
