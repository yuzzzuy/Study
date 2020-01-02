package study.递归.总结;

import org.junit.jupiter.api.Test;
import study.model.ListNode;

/**
 * @fileName: test1
 * @author: WangChen
 * @date: 2019/12/31 14:25
 * @description: 合并两个有序链表
 */
public class test1 {
    @Test
    public void Solution() {
        ListNode head = init();
        ListNode head1 = init1();
        System.out.println(mergeTwoLists1(head, head1).toString());
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;

        }
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        // maintain an unchanging reference to node ahead of the return node.
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        // exactly one of l1 and l2 can be non-null at this point, so connect
        // the non-null list to the end of the merged list.
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }


    public ListNode init() {
        ListNode head = null;
        ListNode l1 = new ListNode();
        l1.val = 1;
        head = l1;
        for (int i = 2; i < 4; i++) {
            ListNode l2 = new ListNode(i);
            l1.next = l2;
            if (i == 4) {
                l1.next = null;
            } else {
                l1 = l1.next;
            }
        }
        return head;
    }

    public ListNode init1() {
        ListNode head = null;
        ListNode l1 = new ListNode();
        l1.val = 1;
        head = l1;
        for (int i = 1; i < 4; i++) {
            ListNode l2 = new ListNode(i);
            l1.next = l2;
            if (i == 3) {
                l1.next = null;
            } else {
                l1 = l1.next;
            }
        }
        return head;
    }
}
