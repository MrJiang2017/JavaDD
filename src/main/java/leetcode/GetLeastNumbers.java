package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，
 * 则最小的4个数字是1、2、3、4。
 * 示例 1：
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * 示例 2：
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 * @author
 */
public class GetLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k==0){
            return new int[0];
        }
        Queue<Integer> heap = new PriorityQueue<>(k, (i1, i2) -> Integer.compare(i2, i1));
        for (int num:heap){
            if (heap==null ||heap.size()<k||num<heap.peek()){
                heap.offer(num);
            }
            if (heap.size()>k){
                heap.poll();
            }
        }
        int[] res = new int[k];
        int x=0;
        for (int num:heap){
            res[x++] = num;
        }
        return res;
    }
}
