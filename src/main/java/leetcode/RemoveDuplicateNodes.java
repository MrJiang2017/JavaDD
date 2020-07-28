package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 * 示例1:
 *  输入：[1, 2, 3, 3, 2, 1]
 *  输出：[1, 2, 3]
 * 示例2:
 *  输入：[1, 1, 1, 1, 2]
 *  输出：[1, 2]
 */
public class RemoveDuplicateNodes {
    public NodeInteger removeDuplicateNodes(NodeInteger head) {
        if(head==null){
            return head;
        }
        Set<Integer> set = new HashSet<>();
        NodeInteger cur = head;
        set.add(cur.data);
        while(cur.next!=null){
            if(set.contains(cur.next.data)){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
                set.add(cur.data);
            }
        }
        return head;
    }
}
