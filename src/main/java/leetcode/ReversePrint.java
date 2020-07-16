package leetcode;

import java.util.LinkedList;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *  
 *
 * 限制：
 *
 * 0 <= 链表长度 <= 10000
 * @author
 */
public class ReversePrint {
    public String[] reversePrint(Node head) {
        LinkedList<String> stack = new LinkedList<String>();
        while (null!=head){
            stack.addLast(head.data);
            head = head.next;
        }
        String[] res = new String[stack.size()];
        for (int i=0;i<res.length;i++){
            res[i] = stack.removeLast();
        }
        return res;
    }

}
