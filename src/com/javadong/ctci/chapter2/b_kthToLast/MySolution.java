package com.javadong.ctci.chapter2.b_kthToLast;


import com.javadong.ctci.chapter2.ListNode;

/**
 * 实现一种算法，找出单向链表中倒数第 k个节点
 */
public class MySolution {
    public int kthToLast(ListNode head, int k) {
        if (head == null) return -1;
        int len = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            len ++;
        }

        p = head;
        int count = 0;
        while (p != null) {
            if (++count == len - k + 1) {
                return p.val;
            } else {
                p = p.next;
            }
        }
        return -1;


    }
}
