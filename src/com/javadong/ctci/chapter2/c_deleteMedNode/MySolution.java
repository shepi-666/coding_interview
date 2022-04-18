package com.javadong.ctci.chapter2.c_deleteMedNode;

import com.javadong.ctci.chapter2.ListNode;

/**
 * 若链表中的某个节点，既不是链表头节点，也不是链表尾节点，则称其为该链表的「中间节点」。
 *
 * 假定已知链表的某一个中间节点，请实现一种算法，将该节点从链表中删除。
 */
public class MySolution {
    public void deleteNode(ListNode node) {
        // 复制下一个节点的值
        node.val = node.next.val;
        // 将下个节点删除
        node.next = node.next.next;
    }
}
