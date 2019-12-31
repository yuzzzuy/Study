package com.example.demo.递归.递归;

import com.example.demo.model.ListNode;

/**
 * @fileName: test
 * @author: WangChen
 * @date: 2019/12/17 16:43
 * @description:
 */


class Solution {
    public ListNode swapPairs(ListNode head) {
        return head;
    }
}

public class test {
    public static void main(String[] args) {


        int[] num = {1, 2, 3, 4};
        ListNode head;
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        head = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = null;
//        p2.next=p1;
//        p1.next=p4;
//        p4.next=p3;
//        h=p2;
//        System.out.println(h);
        //偶数数
        //1->2->3->4 2->1->4->3
        ListNode pre=head;
        ListNode preNext=head.next;
        ListNode cur=preNext.next;
        //cur可能为空
        pre.next=cur;
        preNext.next=pre;
        //新的头部
        head=preNext;
        while(cur!=null&&cur.next!=null){
            //交换时第二个结点元素
            preNext=cur.next;
            //下一次交换的第一个元素
            cur=preNext.next;
            pre.next.next=cur;
            //第二个元素后面链接第一个元素
            preNext.next=pre.next;
            //上一次的交换后的第二个元素链接本次第二个元素
            pre.next=preNext;
            //交换后的第二个元素
            pre=preNext.next;
        }
        System.out.println(head);


    }
}
