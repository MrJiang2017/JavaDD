package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back
 * 和 pop_front 的均摊时间复杂度都是O(1)。
 * 若队列为空，pop_front 和 max_value 需要返回 -1
 * 示例 1：
 * 输入:
 * ["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
 * [[],[1],[2],[],[],[]]
 * 输出: [null,null,null,2,1,2]
 * 示例 2：
 * 输入:
 * ["MaxQueue","pop_front","max_value"]
 * [[],[],[]]
 * 输出: [null,-1,-1]
 *
 */
public class MaxQueue {
    Queue<Integer> queue;
    LinkedList<Integer> max;
    public MaxQueue() {
        queue = new LinkedList();
        max = new LinkedList();
    }

    public int max_value() {
        return max.size()==0?-1:max.getFirst();
    }

    public void push_back(int value) {
        queue.add(value);
        while(max.size()>0 && max.getLast()<value){
            max.removeLast();
        }
        max.add(value);
    }

    public int pop_front() {
        if(max.size()>0 && max.getFirst().equals(queue.peek())){
            max.removeFirst();
        }
        return queue.size()==0?-1:queue.poll();
    }
}
