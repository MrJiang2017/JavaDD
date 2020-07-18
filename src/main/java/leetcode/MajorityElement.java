package leetcode;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 示例 1:
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 输出: 2
 * @author
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int x=0,votes=0;
        for (int num:nums){
            if (votes==0){
                x=num;
            }
            votes += num==x?1:-1;
        }
        return x;
    }
}
