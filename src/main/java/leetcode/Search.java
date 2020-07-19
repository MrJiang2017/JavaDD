package leetcode;

/**
 * 统计一个数字在排序数组中出现的次数。
 * 示例 1:
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * 示例 2:
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 * @author
 */
public class Search {
    public int search(int[] nums, int target) {
        int i=0,right = i,j=nums.length-1,left = j;
        while (i<=j){
            int m=(i+j)/2;
            if (nums[m]<=target){
                i=m+1;
            }else {
                j= m-1;
            }
        }
        right = i;
        i=0;j=nums.length-1;
        while (i<=j){
            int m=(i+j)/2;
            if (nums[m]<target){
                i=m+1;
            }else {
                j= m-1;
            }
        }
        left = j;
        return right-left-1;
    }

}
