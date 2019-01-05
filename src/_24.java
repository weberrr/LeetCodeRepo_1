import Utils.*;

import java.util.Arrays;

/**
 * 24. 两两交换链表中的节点
 *
 * @date 2019/1/5
 */
public class _24 {

    //递归 （用循环也可以
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = head.next;
        head.next = swapPairs(head.next.next);
        temp.next = head;
        return temp;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode().createList(Arrays.asList(1, 2, 3, 4));
        new ListNode().printList(new _24().swapPairs(first));
    }
}
