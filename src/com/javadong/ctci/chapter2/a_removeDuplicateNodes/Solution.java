package com.javadong.ctci.chapter2.a_removeDuplicateNodes;

/**
 * 进阶方式：不使用临时缓冲区
 */
public class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null || head.next == null) return head;

        // 使用类似双指针的方式
        ListNode p = head;

        while (p != null) {
            ListNode q = p;
            while (q.next != null) {
                if (q.next.val == p.val) {
                    q.next = q.next.next;
                } else {
                    q = q.next;
                }
            }
            p = p.next;
        }

        return head;
    }
}
