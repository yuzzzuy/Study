package study.递归.递推;

import study.model.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * @fileName: t2
 * @author: WangChen
 * @date: 2019/12/30 16:16
 * @description:
 */
public class reverseList {

    @Test
    public void test() {
        ListNode head = initListNode();
        System.out.println(reverseList2(head).toString());
    }

    //递归
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {return head;}
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
    //迭代
    public ListNode reverseList1(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            System.out.println("head:"+head.toString());
            System.out.println("pre:"+pre.toString());
            if (cur!=null){
                System.out.println("cur:"+cur.toString());
            }
            if (next!=null){
                System.out.println("next:"+next.toString());
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        }
        return pre;
    }

    public ListNode reverseList(ListNode head) {
        //压栈
        Stack<ListNode> data = new Stack<>();
        while (true) {
            if (head.next == null) {
                data.push(head);
                break;
            }
            data.push(head);
            head = head.next;
        }
        System.out.println(data.toString());
        return do_reserve(data);
    }

    public ListNode do_reserve(Stack<ListNode> data) {
        //出栈
        ListNode node = data.pop();
        if (data.empty()) {
            node.next = null;
            System.out.println(node.toString());
            return node;
        }
        node.next = do_reserve(data);
        return node;
    }

    public static ListNode initListNode() {
        ListNode head;
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);
        ListNode p6 = new ListNode(6);
        ListNode p7 = new ListNode(7);
        ListNode p8 = new ListNode(8);
        ListNode p9 = new ListNode(9);

        head = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p7;
        p7.next = p8;
        p8.next = p9;
        p9.next = null;
        return head;
    }
}
