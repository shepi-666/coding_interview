package com.javadong.ctci.chapter2.e_addTwoNumbers;

import com.javadong.ctci.chapter2.ListNode;
import org.junit.Test;

/**
 * 给定两个用链表表示的整数，每个节点包含一个数位。
 * 这些数位是反向存放的，也就是个位排在链表首部。
 * 编写函数对这两个整数求和，并用链表形式返回结果。
 */
public class MySolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode res = new ListNode(0);
        addTwo(l1, l2, res, 0);
        return res.next;
    }
    
    public void addTwo(ListNode l1, ListNode l2, ListNode res, int count) {
        if (l1 == null && l2 == null) {
            if (count == 1) {
                res.next = new ListNode(count);
            }
        }

        else if (l1 == null) {
            if (count == 0 || l2.val + count <= 9) {
                l2.val = l2.val + count;
                res.next = l2;
            } else {
                int i = l2.val + count;
                res.next = new ListNode(i % 10);
                addTwo(l1, l2.next, res.next, i / 10);
            }
        }
        
        else if (l2 == null) {
            if (count == 0 || l1.val + count <= 9) {
                l1.val = l1.val + count;
                res.next = l1;
            } else {
                int i = l1.val + count;
                res.next = new ListNode(i % 10);
                addTwo(l1.next, l2, res.next, i / 10);
            }
        } else {
            int temp = l1.val + l2.val + count;
            res.next = new ListNode(temp % 10);
            addTwo(l1.next, l2.next, res.next, temp / 10);
        }



    }


    @Test
    public void testSolution() {
        ListNode node1 = new ListNode(1);
        // ListNode node2 = new ListNode(1);
        // ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        // ListNode node6 = new ListNode(2);

        // node1.next = node2;
        // node2.next = node3;

        node4.next = node5;
        // node5.next = node6;

        ListNode listNode = addTwoNumbers(node1, node4);
        System.out.println(listNode);
    }
}
