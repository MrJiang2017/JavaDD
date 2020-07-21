package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。
 * 2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 * 示例 1:
 * 输入: [1,2,3,4,5]
 * 输出: True
 * 示例 2:
 * 输入: [0,0,1,2,5]
 * 输出: True
 * @author
 */
public class IsStraight {
    public boolean isStraight(int[] nums) {
        int max = 0,min = 14;
        Set<Integer> res = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            if(res.contains(nums[i])){
                return false;
            }
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
            res.add(nums[i]);

        }
        return (max - min)<5;
    }
}
