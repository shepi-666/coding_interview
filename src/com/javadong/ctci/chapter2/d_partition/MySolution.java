package com.javadong.ctci.chapter2.d_partition;

import com.javadong.ctci.chapter2.ListNode;
import org.junit.Test;

/**
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，
 * 使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 */
public class MySolution {
    public ListNode partition(ListNode head, int x) {
        // 使用删除法 和 头插法的方式
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode q = p;
        boolean flag = false; // 判断是否出现大于等于x的元素
        while (p.next != null) {
            if (p.next.val < x && flag) { // 出现了小值在大的值之前
                // 头插法将这个放在前面
                ListNode node = new ListNode(p.next.val);
                node.next = q.next;
                q.next = node;
                // 删除节点
                p.next = p.next.next;
            } else if (p.next.val >= x) {
                flag = true;
                p = p.next;
            } else {
                p = p.next;
            }
        }

        return q.next;

    }


    @Test
    public void testSolution() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);

        node1.next = node4;
        node4.next = node3;
        node3.next = node2;
        node2.next = node5;
        node5.next = node6;

        ListNode node = partition(node1, 3);
        System.out.println(node);

    }
}
