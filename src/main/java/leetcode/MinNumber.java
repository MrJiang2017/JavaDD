package leetcode;

import java.util.Arrays;

/**
 *
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 示例 1:
 * 输入: [10,2]
 * 输出: "102"
 * 示例 2:
 * 输入: [3,30,34,5,9]
 * 输出: "3033459"
 * 提示:
 * 0 < nums.length <= 100
 *
 */
public class MinNumber {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i=0;i<nums.length;i++){
            strs[i] = nums[i]+"";
        }
        Arrays.sort(strs,(x,y)->(x+y).compareTo(y+x));
        StringBuilder sb = new StringBuilder();
        for (String s:strs){
            sb.append(s);
        }
        return sb.toString();
    }
}
