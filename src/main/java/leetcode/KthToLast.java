package leetcode;

/**
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 * 注意：本题相对原题稍作改动
 * 示例：
 * 输入： 1->2->3->4->5 和 k = 2
 * 输出： 4
 *
 */
public class KthToLast {
    public int kthToLast(NodeInteger head, int k) {
        NodeInteger p = head;
        for(int i=0;i<k;i++){
            p = p.next;
        }
        while(p!=null){
            p = p.next;
            head = head.next;
        }
        return head.data;
    }
}
