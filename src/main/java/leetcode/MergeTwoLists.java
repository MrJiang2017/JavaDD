package leetcode;

/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * 示例1：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * @author
 */
public class MergeTwoLists {
    public NodeInteger mergeTwoLists(NodeInteger l1, NodeInteger l2) {
        NodeInteger dum = new NodeInteger(0),cur = dum;
        while (l1!=null && l2!=null){
            if (l1.data<l2.data){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next= l2;
                l2= l2.next;
            }
            cur = cur.next;
        }
        cur.next  = l1!=null?l1:l2;
        return dum.next;
    }
}
