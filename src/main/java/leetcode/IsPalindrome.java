package leetcode;

/**
 * 编写一个函数，检查输入的链表是否是回文的。
 * 示例 1：
 * 输入： 1->2
 * 输出： false
 * 示例 2：
 * 输入： 1->2->2->1
 * 输出： true
 *
 */
public class IsPalindrome {
    public boolean isPalindrome(Node head) {
        if(head==null){
            return true;
        }
        Node minNode = findMidNode(head);
        Node secondHelfNode = reverseLinked(minNode.next);
        Node cur1 = head;
        Node cur2 = secondHelfNode;

        while(cur2!=null){
            if(cur1.data !=cur2.data){
                return false;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return true;
    }

    /**
     * 链表反转
     **/
    /* 反转链表 */
    private Node reverseLinked(Node head){
        Node cur = head;
        Node prev = null;
        while(cur != null){
            Node nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }
        return prev;
    }

    /**
     * 中间链表
     **/
    private Node findMidNode(Node head){
        Node fast = head;
        Node low = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }
}
