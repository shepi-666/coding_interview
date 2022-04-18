package com.javadong.ctci.chapter2.a_removeDuplicateNodes;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 * 进阶：如果不得使用临时缓冲区，该怎么解决？
 */
public class MySolution {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null || head.next == null) return head;
        Set<Integer> temp = new HashSet<>();

        ListNode p = new ListNode(0);
        p.next = head;
        while (p.next != null) {
            if (!temp.contains(p.next.val)) {
                p = p.next;
                temp.add(p.val);
            } else {
                p.next = p.next.next;
            }
        }
        return head;

    }
}

class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
    public ListNode() {}
}
