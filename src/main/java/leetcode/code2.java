package leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author WangChen
 * @filename code2
 * @date 2020/1/15 14:58
 * @description 两数相加
 */
public class code2 {
    //给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
    //如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
    //您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(val + "->" + next);
            return sb.toString();
        }
    }

    @Test
    public void test() {
        ListNode l1 = init(1);
        ListNode l2 = init(2);
        long begin = System.nanoTime();
        System.out.println(addTwoNumbers(l1, l2).toString());
        System.out.println((System.nanoTime() - begin) / 1000 + "ms");
        System.out.println(l1.toString());
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0);
        ListNode cursor = h;
//        //进位标识
//        int target = 0;
//        while (l1 != null || l2 != null || target != 0) {
//            //计算
//            int n1 = l1 != null ? l1.val : 0;
//            int n2 = l2 != null ? l2.val : 0;
//            int sum = n1 + n2 + target;
//            //进位监控器
//            target = sum / 10;
//
//            //存入新链表
//            ListNode listNode = new ListNode(sum % 10);
//            cursor.next = listNode;
//            cursor = listNode;
//
//            //链表后移判断
//            if (l1 != null) {
//                l1 = l1.next;
//            }
//            if (l2 != null) {
//                l2 = l2.next;
//            }
//        }
//        return h.next;
//    }
        //自己写法  消耗空间
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int i = n1 + n2;


            //判断是否超过两位： 超过增加下一次链表的计算值（缺点：破环原有的链表数据 解决：当使用过可以减去并断开(小BUG逻辑很麻烦)）
            if (i >= 10 || (l1 == null && l2 == null)) {
                i = i % 10;
                if (l1.next != null) {
                    l1.next.val = l1.next.val + 1;
                } else {
                    l1.next = new ListNode(1);
                }
            }

            //移动链表
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            //节点存储
            ListNode listNode = new ListNode(i);
            h.next = listNode;
            h = listNode;
        }
        return cursor.next;
    }


    public ListNode init(int i) {
        if (i == 1) {
            ListNode l1 = new ListNode(2);
            ListNode l2 = new ListNode(4);
            ListNode l3 = new ListNode(8);
            l1.next = l2;
            l2.next = l3;
            return l1;
        } else if (i == 2) {
            ListNode l1 = new ListNode(5);
            ListNode l2 = new ListNode(6);
            ListNode l3 = new ListNode(4);
            l1.next = l2;
            l2.next = l3;
            return l1;
        }
        return null;
    }

}
