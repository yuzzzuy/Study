package com.example.demo.model;

/**
 * @fileName: ListNode
 * @author: WangChen
 * @date: 2019/12/30 16:18
 * @description:
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode() {
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(val+"->"+next);
        return sb.toString();
    }


    public int size(ListNode head){
        if (head == null){
            return 0;
        }
        int size = 1;
        while (head.next!=null){
            size++;
            head = head.next;
        }
        return size;
    }

    public int size(){
        ListNode node = this;
        int size = 1;
        while (node.next!=null){
            size++;
            node = node.next;
        }
        return size;
    }
}
