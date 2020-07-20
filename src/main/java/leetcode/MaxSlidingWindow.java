package leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 *
 * 示例:
 *
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 *
 *   滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 * @author
 */
public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || nums.length==0|| k==0){
            return new int[0];
        }
        int[] res = new int[nums.length-k+1];
        Deque deque = new LinkedList();
        for(int i=0;i<k;i++){
            while(!deque.isEmpty()  && (int)deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        res[0]= (int)deque.peekFirst();
        for(int i=k;i<nums.length;i++){
            if((int)deque.peekFirst()==nums[i-k]){
                deque.removeFirst();
            }
            while(!deque.isEmpty()  && (int)deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            res[i-k+1] = (int)deque.peekFirst();
        }
        return res;
    }
}
